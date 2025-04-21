#include <stdio.h>
#include <stdlib.h>

typedef struct Vozlisce Vozlisce;
struct Vozlisce {
    int podatek;
    Vozlisce* naslednje;
};

Vozlisce *obrni(Vozlisce *zacetno)
{
    Vozlisce *t = zacetno;
    Vozlisce *p = zacetno;

    // prestejemo st vozlisc
    int counter = 0;
    while (t->naslednje != NULL)
    {
        t = t->naslednje;
        counter++;
    }

    Vozlisce **tabela = malloc((counter + 1) * sizeof(Vozlisce));
    int i = 0;

    while (p != NULL)
    {
        tabela[i] = p;
        p = p->naslednje;
        i++;
    }

    i--;

    for (int j = 0; j < counter + 1; j++)
    {
        tabela[i]->naslednje = tabela[i - 1];
        i--;
    }

    zacetno->naslednje = NULL;

    free(tabela);
    free(p);

    return t;
}

int main()
{
    Vozlisce *prvo = malloc(sizeof(Vozlisce));
    Vozlisce *drugo = malloc(sizeof(Vozlisce));
    Vozlisce *tretje = malloc(sizeof(Vozlisce));
    Vozlisce *cetrto = malloc(sizeof(Vozlisce));
    Vozlisce *peto = malloc(sizeof(Vozlisce));
    
    prvo->naslednje = drugo;
    drugo->naslednje = tretje;
    tretje->naslednje = cetrto;
    cetrto->naslednje = peto;
    peto->naslednje = NULL;

    prvo->podatek = 1;
    drugo->podatek = 2;
    tretje->podatek = 3;
    cetrto->podatek = 4;
    peto->podatek = 5;

    Vozlisce *obravnavano = malloc(sizeof(Vozlisce));
    obravnavano = prvo;
    printf("Pravi vrstni red: \n");
    while (obravnavano != NULL)
    {
        printf("%d ", obravnavano->podatek);
        obravnavano = obravnavano->naslednje;
    }

    printf("\nZdaj pa obrnemo:\n");

    obravnavano = obrni(prvo);
    while (obravnavano != NULL)
    {
        printf("%d ", obravnavano->podatek);
        obravnavano = obravnavano->naslednje;
    }

    printf("\n");
    free(obravnavano);
    free(prvo);
    free(drugo);
    free(tretje);
    free(cetrto);
    free(peto);

    return 0;
}