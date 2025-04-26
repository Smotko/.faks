#include <stdio.h>
#include <stdlib.h>

int main()
{
    int st_iteracij, counter;
    char trenutni;
    scanf("%d", &st_iteracij);
    char tabela[st_iteracij];
    scanf("%c", &trenutni);

    for (int i = 0; i < st_iteracij; i++)
    {
        scanf("%c", &trenutni);
        tabela[i] = trenutni;
    }

    counter = 0;
    int stevec = 0;
    for (int i = 0; i < st_iteracij; i++)
    {
        for (int j = i + 1; j < st_iteracij; j++)
        {
            if (tabela[i] == '+' && tabela[j] == '+')
            {
                counter += j - i;
                i = j - 1;
                stevec++;
                break;
            }
        }
    }

    if (stevec != 0)
        counter = counter / stevec;

    printf("%d\n", counter);

    return 0;
}