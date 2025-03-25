/*
FP števila, Pa3cio, UL FRI, ARS 2022
prevedi z: gcc -o FPstevila FPstevila.c 
zaženi z: ./FPstevila
*/

#include <assert.h>
#include <float.h>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define NESKONCNO 0x7F800000 // zapis neskončnega FP stevila v bitni 32-bitni obliki (E = 0xFF, M = 0)

void izpisiNapaka(){
    printf("\n?!?!? WTF !?!? \n");
}

bool jeNeskoncno(float A) {
    // iz zapisa odstranimo prvi bit predznaka in preverimo ali je neskončno:
    if ((*(int *)&A & 0x7FFFFFFF) == NESKONCNO)
        return true;
    return false;
}

bool jeNaN(float A) {
  // NAN: E = 0xFF, M != 0 
  // izločimo eksponent:
  int exp = (*(int *)&A & 0x7F800000) >> 23;
  // izločimo mantiso:
  int mantissa = *(int *)&A & 0x007FFFFF;
  if (exp == 0xFF && mantissa != 0)
    return true;
  return false;
}

int Predznak(float A) {
  // Vrnimo predznak (0x00000000 ali 0x80000000):
  return (*(int *)&A) & 0x80000000;
}

// V FP nikoli ne smemo početi tega: if (a == b) !!!!
// Funkcija preveri ali sta dve FP stevili 'skoraj' enaki 
// Primerjavo izvajamo na osnovi ULP razdalje med števili
// če je razdalja manjša od maxULPs, potem rečemo, da sta števili enaki
// maxULPs določa, koliko smeta biti narazen v ULP-jih, da ju še smatram za enaki
bool StaSkorajEnakiULP(float A, float B, int maxULPs) {
    
    // 1. Ali je katero izmed števil neskončno? 
    if (jeNeskoncno(A) || jeNeskoncno(B))
        return A == B;  // potem sta enaki, če se ujemata v vseh bitih

    // 2. Ali je katero število NaN?
    if (jeNaN(A) || jeNaN(B))
        return false;   // ker nista števili, potem niti ne moreta biti enaki

    // 3. Preverimo ali se razlikujeta v predznaku:
    if (Predznak(A) != Predznak(B))
        return false; // če nimata enakega predznaka, potem nista enaki

    // 4. Primerjamo velikosti na osnovi ULP razdalje:
    int aInt = *(int *)&A;
    // izločimo le abs. velikost, da ju lažje primerjam
    if (aInt < 0)
        aInt = 0x80000000 - aInt;
    // izločimo le abs. velikost, da ju lažje primerjam
    int bInt = *(int *)&B;
    if (bInt < 0)
        bInt = 0x80000000 - bInt;
    // primerjam:
    int intDiff = abs(aInt - bInt); // odštejem njuni absolutni velikosti, da dobim ULP razdaljo)
    if (intDiff <= maxULPs)
        return true;  // sta zeloo blizu, torej enaki
    return false;     // sta precej narazen, torej neenaki
}

void IzracunajRazlikoULP(float A, float B){
  int aInt = (*((int *)&A));
  int bInt = (*((int *)&B));

  // izločimo le abs. velikost, da ju lažje primerjam
  if (aInt < 0)
      aInt = 0x80000000 - aInt;
  // izločimo le abs. velikost, da ju lažje primerjam
  if (bInt < 0)
      bInt = 0x80000000 - bInt;
  // razlika v ULP:
  int intDiff = abs(aInt - bInt); // odštejem njuni absolutni velikosti, da dobim ULP razdaljo

  printf("Števili %+1.15f in %+1.15f sta narazen za %d ULPjev\n", A, B, intDiff);
}



// Izpiši FP število in njegovo predstavitev v HEX:
void IzpisiFPstevilo(float f, int offset) {
  // obravnavaj podano FP število kot 32 bitni int in dodaj offset:
  (*((int *)&f)) += offset;
  int x1 = (*((int *)&f)) - 1;
  int x2 = (*((int *)&f)) + 1;
  float f1 = (*((float *)&x1)) ; // FP število pred številom f (predhodnik)
  if (f == 0.0) f1 = (*((float *)&x2));

  // izračunamo ulp med predhodnikom in f
  float ulp_1 = fabs(f - f1);

  // izločimo eksponent in mantiso iz f:
  int E = ( ((*((int *)&f)) & 0x7FFFFFFF ) >> 23 );
  int M = ((*((int *)&f)) & 0x007FFFFF);

  // izpišimo vse podatke:
  if (E == 0) {
    // Izpiši denormalizirano ali ničlo:
    if (M == 0) { //ničla
      printf("%+1.15f \t\t 0x%08X, E=0x%02X, M=0x%06X, ničla, ulp=%+1.15g\n", f, *(int *)&f, E, M, ulp_1);
    }
    else { //denormalizirano
      printf("%+1.15f \t\t 0x%08X, E=0x%02X(%d), M=0x%06X, denormalizirano, ulp=%+1.15g \n", f, *(int *)&f, E, E-126, M, ulp_1);
    }
  } 
  else {
    // Izpiši:
    printf("%+1.15f \t\t 0x%08X, E=0x%02X(%d), M=0x%06X, ulp=%+1.15g\n", f, *(int *)&f, E, E-127, M, ulp_1);
  }
  
}


// Izpiši FP število v znanstveni notaciji ter njegovo predstavitev v HEX:
void IzpisiFPsteviloScient(float f, int offset) {
  // obravnavaj podano FP število kot 32 bitni int in dodaj offset:
  (*((int *)&f)) += offset;
  int x1 = (*((int *)&f)) - 1;
  int x2 = (*((int *)&f)) + 1;
  float f1 = (*((float *)&x1)) ; // FP število pred številom f (predhodnik)
  

  // izračunamo ulp med predhodnikom in f
  float ulp_1 = fabs(f - f1);
  

  // izločimo eksponent in mantiso iz f:
  int E = ( ((*((int *)&f)) & 0x7FFFFFFF ) >> 23 );
  int M = ((*((int *)&f)) & 0x007FFFFF);

  if (E == 0) {
    // Izpiši denormalizirano ali ničlo:
    if (M == 0) { //ničla
      printf("%+1.15g \t\t 0x%08X, E=0x%02X, M=0x%06X, ničla, ulp=%+1.15g \n", f, *(int *)&f, E, M, ulp_1);
    }
    else { //denormalizirano
      printf("%+1.15g \t\t 0x%08X, E=0x%02X(%d), M=0x%06X, denormalizirano, ulp=%+1.15g \n", f, *(int *)&f, E, E-126, M, ulp_1);
    }
  } 
  else {
    // Izpiši:
    printf("%+1.15g \t\t 0x%08X, E=0x%02X(%d), M=0x%06X, ulp=%+1.15g\n", f, *(int *)&f, E, E-127, M, ulp_1);
  }
}

void Bin2Float(int BinNumber){
  int x = BinNumber;
  float f = (*((float *)&x));
  printf("32-bitni binarni zapis 0x%08X je število v zapisu s plavajočo vejico:\n", BinNumber);
  IzpisiFPsteviloScient(f, 0);
}

void operacijeFP(float f){
    float sum;

    sum = 0.0;
    for (int i = 0; i < 100; ++i)
        sum += f;

    printf("\nStokrat seštejemo %1.1f:\n", f);
    printf("vsota = ");
    IzpisiFPsteviloScient(sum, 0);

    sum = 0.0;
    for (int i = 0; i < 1000000; ++i)
        sum += f;

    printf("\nMiljonkrat seštejemo %1.1f:\n", f);
    printf("vsota = ");
    IzpisiFPsteviloScient(sum, 0);

    printf("\nDesetmiljonkrat seštejemo %1.1f in ga nato prištejemo k velikemu številu a:\n", f);
    float a = 12345678.987654321;
    printf("a = ");
    IzpisiFPstevilo(a, 0);
    sum = 0.0;
    for (int i = 0; i < 10000000; ++i)
        sum += f;
    printf("vsota = ");
    IzpisiFPstevilo(sum, 0);
    a += sum;
    printf("a + vsota = ");
    IzpisiFPstevilo(a, 0);
    printf("a + 1000000 = ");
    IzpisiFPstevilo(13345678.987654321, 0);
    IzracunajRazlikoULP(a, 13345678.987654321);

    printf("\nDesetmiljonkrat prištevamo %1.1f k velikemu številu a:\n", f);
    sum = 0.0;
    a = 12345678.987654321;
    printf("a = ");
    IzpisiFPstevilo(a, 0);
    for (int i = 0; i < 10000000; ++i)
        a += f;
    printf("Novi a = ");
    IzpisiFPstevilo(a, 0);

    printf("\n!?!? WTF !?!?! Seštevanje v FP ni asociativno!");
}


void IzpisiZanimiva() {
  // Izpiši nekaj zanimivih FP števil:
  system("clear"); // počisti konzolo
  printf("\n\n\n");
  printf("**************************************************************************************\n");
  printf("*                               Števila v plavajoči vejici                           *\n");
  printf("*                              (c) Pa3cio, Ul FRI, ARS 2022                          *\n");
  printf("**************************************************************************************\n");

  printf("\n======= FP števila okrog 2.0: ==========\n");
  float f = 2.0;
  for (int i = -2; i <= 2; ++i) {
    IzpisiFPstevilo(f, i);
  }

  printf("\n======= FP števila okrog 20.0: ==========\n");
  f = 20.0;
  for (int i = -2; i <= 2; ++i) {
    IzpisiFPstevilo(f, i);
  }


  printf("\n======= FP števila okrog 200.0: ==========\n");
  f = 200.0;
  for (int i = -2; i <= 2; ++i) {
    IzpisiFPstevilo(f, i);
  }

  printf("\n======= FP števila okrog 2000.0: ==========\n");
  f = 2000.0;
  for (int i = -2; i <= 2; ++i) {
    IzpisiFPstevilo(f, i);
  }

  printf("\n======= FP števila okrog 20000.0: ==========\n");
  f = 20000.0;
  for (int i = -2; i <= 2; ++i) {
    IzpisiFPstevilo(f, i);
  }

  printf("\n======= FP števila okrog 200000.0: ==========\n");
  f = 200000.0;
  for (int i = -2; i <= 2; ++i) {
    IzpisiFPstevilo(f, i);
  }

  printf("\n======= FP števila okrog 2000000.0: ==========\n");
  f = 2000000.0;
  for (int i = -2; i <= 2; ++i) {
    IzpisiFPstevilo(f, i);
  }

  printf("\n======= FP števila okrog 20000000.0: ==========\n");
  f = 20000000.0;
  for (int i = -2; i <= 2; ++i) {
    IzpisiFPstevilo(f, i);
  }

  printf("\n");
  printf("\n=========== FP Ničli: ==========\n");
  IzpisiFPstevilo(0.0f, 0);
  IzpisiFPstevilo(0.0f, 0x80000000);

  printf("\n");
  printf("\n=========== Vrednosti okrog ničle : ==========\n");
  for (int i = 5; i >= 0; --i)
    if(i) IzpisiFPsteviloScient(0.0f, i);
    else IzpisiFPstevilo(0.0f, i);
  for (int i = 0; i <= 5; ++i)
    if(i) IzpisiFPsteviloScient(0.0f, i + 0x80000000);
    else IzpisiFPstevilo(0.0f, i);


  printf("\n");
  printf("\n=========== Najmanjša normalizirana abs vrednost : ==========\n");
  int mn = 0x00800000; // 0 00000001 00.0, E=0x01 (-126), M=00...0
  float mnf = *((float *)&mn);
  IzpisiFPsteviloScient(mnf, 0);
  printf("\n");
  for (int i = 0; i <= 3; ++i) IzpisiFPsteviloScient(mnf, i);
  printf("...\n");

  printf("\n");
  printf("\n=========== Prvo število brez desetiških decimalk : ==========\n");
  int h = 0x4B000000; // 0 1001011 00.0, E=0x96 (23) - za 23 mest premaknemo mantiso v levo in ostanemo brez decimalk
  float hf = *((float *)&h);
  IzpisiFPstevilo(hf, 0);
  printf("...\n");
  for (int i = -3; i <= 3; ++i) IzpisiFPstevilo(hf, i);
  printf("...\n");
  printf("\n KAJ SMO SE NAUČILI: Ko je eksponent po vrednosti večji ali enak 23, ostanemo brez decimalk!!! \n");

  printf("\n");
  printf("\n=========== Največje pozitivno celo liho število : ==========\n");
  int m = 0x4B7FFFFF; // 0 0100 1011 11...1 - E=0x96 (23), M = 11...1 - to je najvecje liho celo stevilo
  float mf = *((float *)&m);
  IzpisiFPstevilo(mf, 0); // to se zgodi, ko je E = 0x97 (24) - od takrat so samo potence števila 2, ki množijo mantiso brez decimalk 
  printf("...\n");
  for (int i = -3; i <= 6; ++i) IzpisiFPstevilo(16777215.0f, i);
  printf("...\n");
  printf("\n KAJ SMO SE NAUČILI: Ko je eksponent po vrednosti večji ali enak 24, nimamo več lihih celih števil!!! \n");
  printf(" KAJ SMO SE NAUČILI: Ko je eksponent po vrednosti večji ali enak 24, jew ULP večji od 1 !!! \n");
  

  printf("\n");
  printf("\n=========== Največja absolutna vrednost : ==========\n");
  m = 0x7F7FFFFF; // 0 11111110 11...1 - M=0xFE - to je max mozna mantisa, 0xFF oznacuje neskoncnost oz. NaN
  mf = *((float *)&m);
  IzpisiFPsteviloScient(mf, 0);

  printf("\n======= FP števila na zgornjem robu : ==========\n");
  printf("...\n");
  for (int i = -5; i <= 0; ++i) {
    IzpisiFPsteviloScient(mf, i);
  }
  printf("\n KAJ SMO SE NAUČILI: Velike vrednosti so zelo narazen med seboj!!!!  \n");
}

float sestej(float a, float b){
    return a + b;
}

int main(int argc, char *argv[]) {
  IzpisiZanimiva();

  printf("\n\n\n");

  printf("0.1 + 0.2 = %.15f \n", sestej(.1, .2));
    if (sestej(.1, .2) != 0.3) {
        izpisiNapaka();
    } 

  printf("\n");
  printf("0.1 : ");
  IzpisiFPstevilo(0.1,0);
  printf("0.2 : ");
  IzpisiFPstevilo(0.2,0);
  printf("0.01 : ");
  IzpisiFPstevilo(0.01,0);

  operacijeFP(0.1);

  printf("\n\n\n Veliko realnih števil ne moremo natančno predstaviti v zapisu s FP (npr. 0.1, 0.2 ali 0.01) !!!! \n");
  printf(" Takrat taka števila zapišemo kot najbližje možno še predstavljivo FP število!!!\n");
  printf(" KAJ SMO SE NAUčILI: Izogibajmo se uporabi števil 10ˆ(-i) v svojih programih\n");

  printf("\n\n\n");
  Bin2Float(0x45C6F89A);

  printf("\n\n\n");

  return 0;
}