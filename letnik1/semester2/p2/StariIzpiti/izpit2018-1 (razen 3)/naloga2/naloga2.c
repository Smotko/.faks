#include <stdio.h>
#include <stdlib.h>

unsigned char *preberi(char *ime_datoteke, int *sirina, int *visina, int *st_bajtov)
{   
    FILE *vhod = fopen(ime_datoteke, "rb");
    char *smeti = malloc(10 * sizeof(char));

    fgets(smeti, 10 ,vhod);
    fscanf(vhod, "%d%d", sirina, visina);
    fgetc(vhod);
    fgets(smeti, 10 ,vhod);

    *st_bajtov = (*visina) * (*sirina) * 3;
    unsigned char *pixli = malloc((*visina) * (*sirina) * 3 * sizeof(unsigned char));
    fread(pixli, sizeof(unsigned char), (3 * (*visina) * (*sirina)), vhod);

    fclose(vhod);
    return pixli;

}

int sivina(unsigned char *pixli, int sirina, int visina, int vrstica, int stolpec)
{
    int R = pixli[(sirina * vrstica + stolpec ) * 3];
    int G = pixli[(sirina * vrstica + stolpec ) * 3 + 1];
    int B = pixli[(sirina * vrstica + stolpec ) * 3 + 2];

    int gray = (R + G + B) / 3;

    return gray;
}

int main(int argc, char **argv)
{
    int *sirina = malloc(sizeof(int));
    int *visina = malloc(sizeof(int));
    int *st_bajtov = malloc(sizeof(int));
    char* ime_datoteke = argv[1];
    unsigned char *pixli = preberi(ime_datoteke, sirina, visina, st_bajtov);
    int rez = sivina(pixli, *sirina, *visina, 1, 1);

    printf("Sirina: %d, Visina: %d, St. bajtov: %d\n", *sirina, *visina, *st_bajtov);
    printf("Sivina: %d\n", rez);

    // for (int i = 0; i < *st_bajtov; i = i + 3)
    //     printf("%d %d %d\n", pixli[i], pixli[i + 1], pixli[i + 2]);

    return 0;
}

/*
int main(int argc, char **argv)
{
    FILE *izhod = fopen(argv[1], "wb");

    fprintf(izhod, "P6\n");
    fprintf(izhod, "3 2\n");
    fprintf(izhod, "255\n");
    unsigned char *pixli = malloc(3 * 2 * sizeof(unsigned char));
    int i = 0;
    pixli[i] = 255;
    pixli[i+ 1] = 0;
    pixli[i+ 2] = 0;

    pixli[i+ 3] = 0;
    pixli[i+ 4] = 255;
    pixli[i+ 5] = 0;

    pixli[i+ 6] = 0;
    pixli[i+ 7] = 0;
    pixli[i+ 8] = 255;

    pixli[i+ 9] = 240;
    pixli[i+ 10] = 224;
    pixli[i+ 11] = 15;

    pixli[i+ 12] = 170;
    pixli[i+ 13] = 51;
    pixli[i+ 14] = 204;

    pixli[i+ 15] = 120;
    pixli[i+ 16] = 231;
    pixli[i+ 17] = 184;

    fwrite(pixli, sizeof(unsigned char), 18, izhod);

    return 0;
}
*/