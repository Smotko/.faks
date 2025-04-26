
/*
 * Va"sa re"sitev druge naloge --- datoteko dopolnite in jo oddajte na spletno u"cilnico!
 *
 * Your solution to task 2 --- complete the file and submit it to U"cilnica!
 *
 * V naslednjo vrstico vpi"site va"so vpisno "stevilko / Enter your student ID number in the next line:
 *
 */

#include "naloga2.h"

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

int main() {
    // po "zelji dodajte kodo za ro"cno testiranje ...
    // add manual testing code if desired ...
    return 0;
}
