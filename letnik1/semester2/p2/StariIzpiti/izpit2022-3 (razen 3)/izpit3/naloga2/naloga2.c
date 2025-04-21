
/*
Ro"cno poganjanje testnih programov (npr. test01.c):

gcc -Dtest test01.c naloga2.c
./a.out

Samodejno testiranje:

export name=naloga2
make test

Testni primeri:

01: primer iz besedila
02..04: ena sama vrstica
05..06: vsaka neprazna vrstica je naslovna
07..10: splo"sni primeri

Datoteke:

test*.c: testni program (prebere testne podatke, pokli"ce va"so funkcijo in izpi"se rezultat)
test*.dat: testni podatki
test*.out: pri"cakovani izhod testnega programa
test*.res: dejanski izhod testnega programa (pri poganjanju z make)
*/

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

#include "naloga2.h"

// Lahko dodate "se kak #include, pomo"zno funkcijo ipd.

//============================================================================

void vstaviH1(Vozlisce* zacetek) {
    Vozlisce *p = zacetek;
    Vozlisce *prejsnje = NULL;

    while(p != NULL)
    {
        if ((prejsnje == NULL || (strlen(prejsnje->niz) == 0)) && (p->naslednje == NULL || (strlen(p->naslednje->niz) == 0)))
        {
            char *temp = calloc(1010 , sizeof(char));
            strcpy(temp, p->niz);

            char *izpis = calloc(1010 , sizeof(char));
            int size = strlen(temp);

            if (size != 0)
            {
                for (int i = 0; i < size; i++)
                {
                    izpis[i + 4] = temp[i];
                }

                izpis[0] = '<';
                izpis[1] = 'h';
                izpis[2] = '1';
                izpis[3] = '>';

                size = size + 4;

                izpis[size] = '<';
                izpis[size + 1] = '/';
                izpis[size + 2]= 'h';
                izpis[size + 3] = '1';
                izpis[size + 4] = '>';
                izpis[size + 5] = '\0';
            }
            
            p->niz = izpis;



        }


        prejsnje = p;
        p = p->naslednje;
    }

}

//============================================================================

// Vrstici z #ifndef in #endif pustite pri miru!

#ifndef test

int main() {

    return 0;
}

#endif
