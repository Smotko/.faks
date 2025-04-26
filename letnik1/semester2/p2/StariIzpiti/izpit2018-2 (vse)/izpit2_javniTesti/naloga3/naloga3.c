
/*
 * Va"sa re"sitev tretje naloge --- datoteko dopolnite in jo oddajte na spletno u"cilnico!
 *
 * Your solution to task 3 --- complete the file and submit it to U"cilnica!
 *
 * V naslednjo vrstico vpi"site va"so vpisno "stevilko / Enter your student ID number in the next line:
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#include <stdio.h>
#include <stdlib.h>

int n;

int kovanci(int st_kovancev, int st_en_eur)
{
    if (st_en_eur < 0)
        return 0;
    if (st_kovancev == n)
        return 1;

    int vsota = 0;
    vsota += kovanci(st_kovancev + 1, st_en_eur + 1);
    vsota += kovanci(st_kovancev + 1, st_en_eur - 1);

    return vsota;
}

int main()
{
    int st_en_eur;
    scanf("%d%d", &n, &st_en_eur);

    int rez = kovanci(0, st_en_eur);

    printf("%d\n", rez); 

    return 0;
}
