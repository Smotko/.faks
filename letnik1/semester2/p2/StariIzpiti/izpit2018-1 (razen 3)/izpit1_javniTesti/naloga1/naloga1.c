
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

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int st_iteracij;
    int trenutno;

    scanf("%d", &st_iteracij);
    int tabela[st_iteracij];
    for (int i = 0; i < st_iteracij; i++)
    {
        scanf("%d", &trenutno);
        tabela[i] = trenutno;
    }

    int pogoj = 1;
    int counter = 0;
    for (int i = 0; i < st_iteracij; i++)
    {
        pogoj = 1;
        for (int j = i; j < st_iteracij; j++)
        {
            if (tabela[i] < tabela[j])
            {
                pogoj = 0;
                break;
            }
        }
        if (pogoj == 1)
            counter++;
    }

    printf("%d\n", counter);
    return 0;
}
