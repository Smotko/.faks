
/*
 * Va"sa re"sitev druge naloge --- datoteko dopolnite in jo oddajte na spletno u"cilnico!
 *
 * Your solution to task 2 --- complete the file and submit it to U"cilnica!
 *
 * V naslednjo vrstico vpi"site va"so vpisno "stevilko / Enter your student ID number in the next line:
 *
 */

#include "naloga2.h"

uchar* preberi(char* imeDatoteke, int* sirina, int* visina, int* stBajtov)
{   
    FILE *vhod = fopen(imeDatoteke, "rb");
    char *smeti = malloc(10 * sizeof(char));

    fgets(smeti, 10 ,vhod);
    fscanf(vhod, "%d%d", sirina, visina);
    fgetc(vhod);
    fgets(smeti, 10 ,vhod);

    *stBajtov = (*visina) * (*sirina) * 3;
    uchar *pixli = malloc((*visina) * (*sirina) * 3 * sizeof(uchar));
    fread(pixli, sizeof(uchar), (3 * (*visina) * (*sirina)), vhod);

    fclose(vhod);
    return pixli;
}

int sivina(uchar* pike, int sirina, int visina, int vrstica, int stolpec)
{
    int R = pike[(sirina * vrstica + stolpec ) * 3];
    int G = pike[(sirina * vrstica + stolpec ) * 3 + 1];
    int B = pike[(sirina * vrstica + stolpec ) * 3 + 2];

    int gray = (R + G + B) / 3;

    return gray;
}

int main() {
    int sirina, visina, stBajtov;
    uchar* pike = preberi("a.ppm", &sirina, &visina, &stBajtov);

    printf("%d\n", stBajtov);
    for (int i = 0;  i < stBajtov;  i++) {
        if (i > 0) {
            printf(" ");
        }
        printf("%d", pike[i]);
    }
    return 0;
}
