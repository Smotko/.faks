#include <stdio.h>
#include <stdlib.h>

void odstrani_duplikate(FILE *vhod, FILE *izhod)
{
    char trenutni = fgetc(vhod);
    char prejsni;
    int zacetek = 0;
    while (trenutni != EOF)
    {
        if (zacetek != 0 && ((trenutni >= 'a' && trenutni <= 'z') || (trenutni >= 'A' && trenutni <= 'Z')))
        {
            if(trenutni != prejsni)
                fputc(trenutni, izhod);
        }
        else
            fputc(trenutni, izhod);
        prejsni = trenutni;
        trenutni = fgetc(vhod);
        zacetek++;
    }

}


int main(int argc, char **argv)
{
    FILE *vhod = fopen(argv[1], "r");
    FILE *izhod = fopen(argv[2], "w");

    odstrani_duplikate(vhod, izhod);

    return 0;
}