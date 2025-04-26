#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void pretvori(unsigned char *znaki, unsigned char *izhod, int iteracije)
{

    for (int i = 0; i < iteracije; i++)
    {
        int trenutni = znaki[i];
        izhod[i * 2] = ((trenutni / 16) + '0');
        if (trenutni % 16 >= 10)
            izhod[i * 2 + 1] = ((trenutni % 16) - 10) + 'A';
        else
            izhod[i * 2 + 1] = trenutni % 16 + '0';


    }
}

int main(int argc, char **argv)
{
    // Generiranje bin datoteke

    /*
    FILE *izhod = fopen(argv[1], "wb");
    int st_pixlov = atoi(argv[2]);

    unsigned char *pixli = malloc( st_pixlov * sizeof(unsigned char));
    
    int i = 0;
        pixli[i] = 8;
        pixli[i+ 1] = 12;
        pixli[i+ 2] = 'I';
        pixli[i+ 3] = 'z';
        pixli[i+ 4] = 'p';
        pixli[i+ 5] = 'i';
        pixli[i+ 6] = 't';
        pixli[i+ 7] = '\n';




    fwrite(pixli, sizeof(unsigned char), st_pixlov, izhod);
    */

    FILE *vhod = fopen(argv[1], "rb");
    int st_char = atoi(argv[2]);
    FILE *izhod = fopen(argv[3], "w");

    unsigned char *znaki = malloc(st_char * sizeof(unsigned char));
    unsigned char *izpis = malloc(st_char * 2 * sizeof(unsigned char));

    for (int i = 0; i < st_char; i++)
    {
        znaki[i] = fgetc(vhod);
    }

    pretvori(znaki, izpis, st_char);
    for (int i = 0; i < st_char; i++)
    {
        fputc(izpis[i * 2], izhod);
        fputc(izpis[i * 2 + 1], izhod);
        if (i != st_char - 1)
            fputc('\n', izhod);
    }

    fclose(izhod);
    fclose(vhod);
    free(znaki);
    free(izpis);

   return 0;

}