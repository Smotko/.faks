
/*
Ro"cno testiranje (npr. za primer 01):

gcc naloga1.c
./a.out vhod01.pgm 150 izhod01.pgm
cmp izhod01.pgm ref01.pgm

Samodejno testiranje:

export name=naloga1
make test

Lahko si pomagate tudi s programom hexdump:

hexdump -C datoteka.pgm

Testni primeri:

01: primer iz besedila
02..07: vsaka pika je bodisi 0 bodisi 255
08..12: splo"sni primeri

Testne datoteke:

test*.par: argumenti ukazne vrstice
vhod*.pgm: vhodna slika
ref*.pgm: pri"cakovana izhodna slika
*/

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

// Lahko dodate "se kak #include, pomo"zno funkcijo ipd.

//============================================================================

int main(int argc, char** argv) {
    FILE *vhod = fopen(argv[1], "rb");
    FILE *izhod = fopen(argv[3], "wb");

    int prag = atoi(argv[2]);

    char *smeti = malloc(10 * sizeof(char));
    fgets(smeti, 10, vhod);

    int sirina;
    int visina;
    fscanf(vhod, "%d%d", &sirina, &visina);
    fgetc(vhod);
    fgets(smeti, 10, vhod);

    unsigned char *piksli = malloc(sirina * visina * sizeof(unsigned char));
    unsigned char *izpis = malloc(sirina * visina * sizeof(unsigned char));

    fread(piksli, sizeof(unsigned char), (sirina * visina), vhod);

    for (int i = 0; i < (sirina * visina); i++)
    {
        if (piksli[i] >= prag)
        {
            izpis[i] = 255;
        }
        else
            izpis[i] = 0;

    }

    fprintf(izhod, "P5\n");
    fprintf(izhod, "%d %d\n", sirina, visina);
    fprintf(izhod, "255\n");

    fwrite(izpis, sizeof(unsigned char), sirina * visina, izhod);

    fclose(vhod);
    fclose(izhod);

    return 0;
}
