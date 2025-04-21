#include <stdio.h>
#include <stdlib.h>

int main()
{
    int sirina, visina, st_iteracij, obravnavano;
    scanf("%d%d%d", &sirina, &visina, &st_iteracij);

    int tabela[3][4];
    int sum = 0;

    for (int i = 0; i < st_iteracij; i++)
    {
        scanf("%d", &obravnavano);

        tabela[obravnavano / 4 ][obravnavano % 4] = 1;
        sum += visina - 1 - obravnavano % 4;

        for (int j = obravnavano % 4 + 1; j < visina; j++)
        {
            if (tabela[obravnavano / 4 ][j] == 1)
                sum--;
        }
    }

    printf("%d\n", sum);



    return 0;
}