
/*
 * Va"sa re"sitev prve naloge --- datoteko dopolnite in jo oddajte na spletno u"cilnico!
 *
 * Your solution to task 1 --- complete the file and submit it to U"cilnica!
 *
 * V naslednjo vrstico vpi"site va"so vpisno "stevilko / Enter your student ID number in the next line:
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{
    int st_iteracij;
    scanf("%d", &st_iteracij);
    
    char trenutno, prejsnje;
    scanf("%c", &trenutno);
    prejsnje = 0;

    for (int i = 0; i < st_iteracij; i++)
    {
        scanf("%c", &trenutno);

        if (prejsnje == 0 && trenutno >= 'a' && trenutno <= 'z')
            trenutno = trenutno - 'a' + 'A';

        if (prejsnje == '_' && trenutno >= 'a' && trenutno <= 'z')
            trenutno = trenutno - 'a' + 'A';
        printf("%c", trenutno);
        prejsnje = trenutno;
    }

    printf("\n");

    return 0;
}
