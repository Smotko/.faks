#include <stdio.h>
#include <stdlib.h>

typedef struct _Vozlisce {
    int podatek;
    struct _Vozlisce* naslednje; // kazalec na naslednika ( NULL, če ga ni)
} Vozlisce;

Vozlisce *odstrani(Vozlisce *osnova, Vozlisce *indeksi)
{
    Vozlisce *p = osnova;
    Vozlisce *prejsnje = NULL;
    int counter = 0;

    if (indeksi->podatek == 0)
    {
        while (indeksi != NULL && indeksi->podatek == counter)
        {
            p = p->naslednje;
            osnova = p;
            counter ++;
            indeksi = indeksi->naslednje;
            prejsnje = p;
        }
    }

    while (p != NULL)
    {
        if (indeksi != NULL && indeksi->podatek == counter)
        {
            indeksi = indeksi->naslednje;

            prejsnje->naslednje = p->naslednje;

            if (indeksi == NULL)
                break;
        }
        else
            prejsnje = p;

        counter++;
        p = p->naslednje;
        
    }

    return osnova;

}


int main()
{
    Vozlisce *osnova1 = malloc(sizeof(Vozlisce));
    Vozlisce *osnova2 = malloc(sizeof(Vozlisce));
    Vozlisce *osnova3 = malloc(sizeof(Vozlisce));
    Vozlisce *osnova4 = malloc(sizeof(Vozlisce));
    Vozlisce *osnova5 = malloc(sizeof(Vozlisce));

    osnova1->podatek = 70;
    osnova1->naslednje = osnova2;

    osnova2->podatek = 30;
    osnova2->naslednje = osnova3;

    osnova3->podatek = 60;
    osnova3->naslednje = osnova4;

    osnova4->podatek = 40;
    osnova4->naslednje = osnova5;

    osnova5->podatek = 50;
    osnova5->naslednje = NULL;

    Vozlisce *indeks1 = malloc(sizeof(Vozlisce));
    Vozlisce *indeks2 = malloc(sizeof(Vozlisce));
    Vozlisce *indeks3 = malloc(sizeof(Vozlisce));

    indeks1->podatek = 1;
    indeks1->naslednje = indeks2;

    indeks2->podatek = 2;
    indeks2->naslednje = indeks3;

    indeks3->podatek = 4;
    indeks3->naslednje = NULL;

    Vozlisce *izpis = odstrani(osnova1, indeks1);

    while (izpis != NULL)
    {
        printf("%d ", izpis->podatek);
        izpis = izpis->naslednje;
    }

    printf("\n");

    return 0;
}