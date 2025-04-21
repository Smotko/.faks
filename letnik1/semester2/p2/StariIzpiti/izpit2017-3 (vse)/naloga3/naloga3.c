#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
    /*
    FILE *izhod = fopen(argv[1], "wb");

    fprintf(izhod, "P6\n");
    fprintf(izhod, "3 4\n");
    fprintf(izhod, "255\n");
    unsigned char *pixli = malloc(3 * 4 * sizeof(unsigned char));
    int i = 0;
    pixli[i] = 140;
    pixli[i+ 1] = 240;
    pixli[i+ 2] = 40;

    pixli[i+ 3] = 30;
    pixli[i+ 4] = 130;
    pixli[i+ 5] = 230;

    pixli[i+ 6] = 20;
    pixli[i+ 7] = 120;
    pixli[i+ 8] = 220;

    pixli[i+ 9] = 20;
    pixli[i+ 10] = 120;
    pixli[i+ 11] = 220;

    pixli[i+ 12] = 20;
    pixli[i+ 13] = 120;
    pixli[i+ 14] = 220;

    pixli[i+ 15] = 140;
    pixli[i+ 16] = 240;
    pixli[i+ 17] = 40;

    pixli[i+ 18] = 200;
    pixli[i+ 19] = 100;
    pixli[i+ 20] = 0;

    pixli[i+ 21] = 30;
    pixli[i+ 22] = 130;
    pixli[i+ 23] = 230;

    pixli[i+ 24] = 200;
    pixli[i+ 25] = 100;
    pixli[i+ 26] = 0;

    pixli[i+ 27] = 20;
    pixli[i+ 28] = 120;
    pixli[i+ 29] = 220;

    pixli[i+ 30] = 140;
    pixli[i+ 31] = 240;
    pixli[i+ 32] = 40;

    pixli[i+ 33] = 20;
    pixli[i+ 34] = 120;
    pixli[i+ 35] = 220;

    fwrite(pixli, sizeof(unsigned char), 36, izhod);
    */

    FILE *vhod = fopen(argv[1], "rb");
    char *smeti = malloc(10 * sizeof(char));
    int sirina, visina;

    fscanf(vhod, "%s", smeti);
    fscanf(vhod, "%d%d", &sirina, &visina);
    fgetc(vhod);
    fscanf(vhod, "%s", smeti);
    fgetc(vhod);

    unsigned char *piksli = malloc(sirina * visina * 3 * sizeof(unsigned char));
    fread(piksli, sizeof(unsigned char), sirina * visina * 3, vhod);
    static int tabela[256][256][256];

    int R;
    int G;
    int B;
    for (int i = 0; i < (sirina * visina * 3); i = i + 3)
    {
        R = piksli[i];
        G = piksli[i + 1];
        B = piksli[i + 2];
        tabela[R][G][B]++;
        printf("%d,%d, %d\n", R, G, B);

    }
    int max = 0;
    int counter = 0;

    for (int i = 0; i < 256; i++)
    {
        for (int j = 0; j < 256; j++)
        {
            for (int k = 0; k < 256; k++)
            {
                if (tabela[i][j][k] > 0)
                {
                    counter++;
                }
                if (tabela[i][j][k] > max)
                    max = tabela[i][j][k];
            }
        }
    }

    printf("%d\n%d\n", counter, max);

    return 0;
}