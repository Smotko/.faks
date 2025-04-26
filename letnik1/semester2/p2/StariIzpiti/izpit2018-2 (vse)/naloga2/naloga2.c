#include <stdio.h>
#include <stdlib.h>

typedef struct _Vozlisce { // vozlišče povezanega seznama
    int podatek; // podatek v vozlišču
    struct _Vozlisce* n; // kazalec na naslednika ( NULL, če ga ni)
    struct _Vozlisce* nn; // kazalec na naslednika naslednika ( NULL, če ga ni)
} Vozlisce;

Vozlisce *create_vozlisce(Vozlisce *n, Vozlisce *nn, int podatek)
{
    Vozlisce *p = malloc(sizeof(Vozlisce));
    p->podatek = podatek;
    p->n = n;
    p->nn = nn;

    return p;
}

Vozlisce *vstaviUrejeno(Vozlisce *zacetek, int element)
{
    if (zacetek == NULL)
        return create_vozlisce(NULL, NULL, element);

    if (zacetek->podatek > element)
        return create_vozlisce(zacetek, zacetek->n, element);

    Vozlisce *p = zacetek;
    Vozlisce *prejsnje = NULL;
    while (p->n != NULL && p->n->podatek < element)
    {
        prejsnje = p;
        p = p->n;
    }

    Vozlisce *novo = create_vozlisce(p->n, p->nn, element);
    p->n = novo;
    p->nn = novo->n;

    if (prejsnje != NULL)
        prejsnje->nn = p->n;

    return zacetek;
}

int main()
{
    Vozlisce *prvo = malloc(sizeof(Vozlisce));
    Vozlisce *drugo = malloc(sizeof(Vozlisce));
    Vozlisce *cetrto = malloc(sizeof(Vozlisce));
    Vozlisce *peto = malloc(sizeof(Vozlisce));

    prvo->podatek = 1;
    prvo->n = drugo;
    prvo->nn = cetrto;

    drugo->podatek = 2;
    drugo->n = cetrto;
    drugo->nn = peto;

    cetrto->podatek = 4;
    cetrto->n = peto;
    cetrto->nn = NULL;

    peto->podatek = 5;
    peto->n = NULL;
    peto->nn = NULL;


    vstavi_urejeno(prvo, 3);

    Vozlisce *trenutno = prvo;

    for (int i = 0; i < 5; i++)
    {
        printf("Trenutno: %d, ", trenutno->podatek);
        if (trenutno->n == NULL)
            printf("naslednje NULL, ");
        else
            printf("naslednje %d, ", trenutno->n->podatek);

        if (trenutno->nn == NULL)
            printf("naslednje naslednje NULL\n");
        else
            printf("naslednje naslednje %d\n", trenutno->nn->podatek);

        trenutno = trenutno->n;
        if (trenutno == NULL)
            break;
    }
    return 0;
}