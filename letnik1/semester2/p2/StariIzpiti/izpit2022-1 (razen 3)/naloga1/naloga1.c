
/*
Ro"cno poganjanje testnih programov (npr. test01.c):

gcc -Dtest test01.c naloga1.c
./a.out

Samodejno testiranje:

export name=naloga1
make test

Testni primeri:

test01: primer iz besedila
test02..test08: ro"cno izdelani kratki testi
test09..test11: samodejno izdelani, tip Exxx_Exxx_Exxx_...
test12..test14: samodejno izdelani, vsakemu E-ju sledi "stevilo iz [100, 999]
test15..test17: samodejno izdelani, splo"sni

.c: testni program (prebere testne podatke, pokli"ce va"so funkcijo in izpi"se rezultat)
.dat: testni podatki
.out: pri"cakovani izhod
.res: izhod va"sega programa (pri poganjanju z make)
*/

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

#include "naloga1.h"

// Lahko dodate "se kak #include, pomo"zno funkcijo ipd.

//============================================================================

int sestEj(char* niz) {

    char trenutni = *niz;
    int pogoj = -1;
    char stevilke[4];
    int stevilo = 0;
    int sum = 0;
    while(trenutni != '\0')
    {
        if (trenutni == 'E')
        {
            pogoj = 0;      
        }
        else if (trenutni >= '0' && trenutni <= '9' && pogoj >= 0 && pogoj < 3)
        {
            stevilke[pogoj] = trenutni;
            pogoj++;
        }
        else if (pogoj == 3 && trenutni == '_')
        {
            stevilo = atoi(stevilke);
            if (stevilo >= 100)
                sum += stevilo;
            pogoj = -1;
        }
        else
            pogoj = -1;

        trenutni = *(++niz);
    }





    return sum;   // popravite
}

//============================================================================

// Vrstici z #ifndef in #endif pustite pri miru!

#ifndef test

int main() {
    char *epic = malloc(6 *sizeof(char));
    epic = "E0357_E089_";
    printf("%d\n", sestEj(epic));
    return 0;
}

#endif
