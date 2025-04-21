
/*
 * Va"sa re"sitev druge naloge --- datoteko dopolnite in jo oddajte na spletno u"cilnico!
 *
 * Your solution to task 2 --- complete the file and submit it to U"cilnica!
 *
 * V naslednjo vrstico vpi"site va"so vpisno "stevilko / Enter your student ID number in the next line:
 *
 */

#include "naloga2.h"
#include <stdbool.h> 

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

int main() {
    // po "zelji dodajte kodo za ro"cno testiranje ...
    // add manual testing code if desired ...
    return 0;
}
