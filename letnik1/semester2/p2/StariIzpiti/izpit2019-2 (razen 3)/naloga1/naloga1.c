#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char **argv)
{

    /*
    // Generiranje bin datoteke
    
    FILE *izhod = fopen(argv[1], "w");
    int st_pixlov = atoi(argv[2]);

    unsigned char *pixli = malloc(3 * st_pixlov * sizeof(unsigned char));
    
    int i = 0;
        pixli[i] = 0;
        pixli[i + 1] = 95;
        pixli[i + 2] = 0;
        i = i + 3;
        pixli[i] = 0;
        pixli[i + 1] = 0;
        pixli[i + 2] = 0;
        i = i + 3;
        pixli[i] = 66;
        pixli[i + 1] = 10; 
        pixli[i + 2] = 0;
        i = i + 3;
        pixli[i] = 0;
        pixli[i + 1] = 0; 
        pixli[i + 2] = 60;
        i = i + 3;
        pixli[i] = 0;
        pixli[i + 1] = 37; 
        pixli[i + 2] = 0;
        i = i + 3;
        pixli[i] = 0;
        pixli[i + 1] = 205; 
        pixli[i + 2] = 208;
        i = i + 3;
        pixli[i] = 0;
        pixli[i + 1] = 5; 
        pixli[i + 2] = 0;




    fwrite(pixli, sizeof(unsigned char), 3 *st_pixlov, izhod);
    */

    FILE *vhod = fopen(argv[1], "rb");
    FILE *izhod = fopen(argv[3], "w");
    int st_pixlov = atoi(argv[2]);

    
    unsigned char *pixli = malloc(3 * st_pixlov * sizeof(unsigned char));

    fread(pixli, sizeof(unsigned char), 3 * st_pixlov, vhod);   
    unsigned char trenutniR;
    unsigned char trenutniG;
    unsigned char trenutniB;

    int izpis1 = 0;
    int izpis2 = 0;
    int izpis3 = 0;

    for (int i = 0; i < st_pixlov; i++)
    {   
        trenutniR = pixli[(i * 3)];
        trenutniG = pixli[(i * 3) + 1];
        trenutniB = pixli[(i * 3) + 2];

        if (trenutniR > 0 && trenutniG == 0 && trenutniB == 0)
            izpis1++;

        if (trenutniR == 0 && trenutniG > 0 && trenutniB == 0)
            izpis2++;

        if (trenutniR == 0 && trenutniG == 0 && trenutniB > 0)
            izpis3++;

    }

    fprintf(izhod, "%d\n%d\n%d", izpis1, izpis2, izpis3);

    return 0;
}