#include <stdio.h>
#include <stdlib.h>

int main()
{
    char tabela[100000];
    char trenutni;
    scanf("%c", &trenutni);
    tabela[0] = ' ';
    int dolzina = 1;
    while (trenutni != '\n')
    {
        tabela[dolzina] = trenutni;
        dolzina++;
        scanf("%c", &trenutni);
    }
    tabela[dolzina] = ' ';
    dolzina++;

    int st_length = 0;
    int stevilo = 0;
    int rezultat = 0;
    for (int i = 0; i < dolzina; i++)
    {
        if (tabela[i] >= '0' && tabela[i] <= '9')
        {
            stevilo = stevilo * 10 + tabela[i] - '0';
            st_length++;
        }
        else if (tabela[i] == ' ' && tabela[i - st_length - 1] == ' ')
        {
            rezultat += stevilo;
            stevilo = 0;
            st_length = 0;
        }
        else
        {
            stevilo = 0;
            st_length = 0;
        }
    }


    printf("%d\n", rezultat);
    return 0;
}