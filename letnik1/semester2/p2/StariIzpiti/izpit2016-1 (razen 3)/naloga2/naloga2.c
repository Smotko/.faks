#include <stdio.h>
#include <stdlib.h>

int main()
{
    int tabela[301][301];

    int st_iteracij, x, y, sirina;

    scanf("%d", &st_iteracij);

    for (int i = 0; i < 301; i++)
        {
            for (int j = 0; j < 301; j++)
                tabela[i][j] = 0;
        }

    for (int i = 0; i < st_iteracij; i++)
    {
        scanf("%d%d%d", &x, &y, &sirina);
        for (int j = 0; j < sirina; j++)
        {
            for (int k = 0; k < sirina; k++)
                tabela[100 + j + x][100 + k + y]++;
        }
    }

    for (int k = 1; k < st_iteracij + 1; k++)
    {
        int stevec = 0;
        for (int i = 0; i < 301; i++)
        {
            for (int j = 0; j < 301; j++)
            {
                if(tabela[i][j] == k)
                    stevec++;
            }
        }
        printf("%d\n", stevec);
    }

    return 0;
}