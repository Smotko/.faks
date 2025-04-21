#include <stdio.h>
#include <stdlib.h>

typedef struct _Vozlisce {
    struct _Vozlisce* n; // naslednje vozlišče v verigi oz. NULL, če ga ni
} Vozlisce;

Vozlisce* sticisce(Vozlisce* a, Vozlisce* b)
{
    Vozlisce *pa = a;
    Vozlisce *pb = b;

    int razdalja_a = 0;
    int razdalja_b = 0;

    while (pa != NULL)
    {
        pa = pa->n;
        razdalja_a++;
    }

    while (pb != NULL)
    {
        pb = pb->n;
        razdalja_b++;
    }

    pa = a;
    pb = b;

    int diff;
    if (razdalja_a > razdalja_b)
    {
        diff = razdalja_a - razdalja_b;

        for (int i = 0; i < diff; i++)
        {
            pa = pa->n;
        }

        while (pa != pb)
        {
            pa = pa->n;
            pb = pb->n;
        }

    }
    else
    {
        diff = razdalja_b -razdalja_a;

        for (int i = 0; i < diff; i++)
        {
            pb = pb->n;
        }

        while (pa != pb)
        {
            pa = pa->n;
            pb = pb->n;
        }
    }

    // pocasnejsa resitev

    // while (pa != NULL)
    // {
    //     pb = b;
    //     while(pb != NULL)
    //     {
    //         if (pb == pa)
    //             return pa;
    //         pb = pb->n;
    //     }
    //         pa = pa->n;
    // }

    return pa;
    
}

int main()
{
    Vozlisce *prvo_a = malloc(sizeof(Vozlisce));
    Vozlisce *drugo_a = malloc(sizeof(Vozlisce));
    Vozlisce *tretje_a = malloc(sizeof(Vozlisce));

    Vozlisce *prvo_b = malloc(sizeof(Vozlisce));
    Vozlisce *drugo_b = malloc(sizeof(Vozlisce));

    Vozlisce *prvo_s = malloc(sizeof(Vozlisce));
    Vozlisce *drugo_s = malloc(sizeof(Vozlisce));
    Vozlisce *tretje_s = malloc(sizeof(Vozlisce));

    prvo_a->n = drugo_a;
    drugo_a->n = tretje_a;
    tretje_a->n = prvo_s;

    prvo_b->n = drugo_b;
    drugo_b->n = prvo_s;

    prvo_s->n = drugo_s;
    drugo_s->n = tretje_s;
    tretje_s->n = NULL;

    int counter = 0;
    Vozlisce *p = sticisce(prvo_a, prvo_b);

    while(p != NULL)
    {
        counter++;
        p = p->n;
    }

    printf("%d\n", counter);

    return 0;
}