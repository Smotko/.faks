#include <stdio.h>
#include <stdlib.h>

typedef struct _Vozlisce {
    int podatek;
    struct _Vozlisce *naslednje;
} Vozlisce;

Vozlisce *izloci(Vozlisce *zac, Vozlisce *v)
{
    if (zac == v)
        return zac->naslednje;

    Vozlisce *obravnavano = zac;
    Vozlisce *prejsnje = zac;
    while(obravnavano != v)
    {
        prejsnje = obravnavano;
        obravnavano = obravnavano->naslednje;
    }

    prejsnje->naslednje = obravnavano->naslednje;

    return zac;
}

int main()
{
    Vozlisce *prvo = malloc(sizeof(Vozlisce));
    Vozlisce *drugo = malloc(sizeof(Vozlisce));
    Vozlisce *tretje = malloc(sizeof(Vozlisce));

    prvo->naslednje = drugo;
    prvo->podatek = 1;
    drugo->naslednje = tretje;
    drugo->podatek = 2;
    tretje->naslednje = NULL;
    tretje->podatek = 3;

    Vozlisce *trenutno = izloci(prvo, prvo);

    while(trenutno != NULL)
    {
        printf("%d ", trenutno->podatek);
        trenutno = trenutno->naslednje;
    }

    free(prvo);
    free(drugo);
    free(tretje);

    return 0;
}