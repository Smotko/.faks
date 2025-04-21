#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int tabela[8][8];

    for (int i = 0; i < 8; i++)
    {
        for (int j = 0; j < 8; j++)
            tabela[i][j] = 0;
    }
    int st_iteracij;
    int trenutno;
    scanf("%d", &st_iteracij);
    int x = 7;
    int y = 7;
    tabela[x][y] = 1;

    for (int i = 0; i < st_iteracij; i++)
    {
        scanf("%d", &trenutno);

        if (trenutno == 0 && y - 1 >= 0 && y - 1 <= 7)
            tabela[x][--y] = 1;
        else if (trenutno == 1 && x - 1 >= 0 && x - 1 <= 7)
            tabela[--x][y] = 1;
        else if (trenutno == 2 && y + 1 >= 0 && y - 1 <= 7)
            tabela[x][++y] = 1;
        else if (trenutno == 3 &&  x + 1 >= 0 && x + 1 <= 7)
            tabela[++x][y] = 1;
    }

    /*
    for (int i = 0; i < 8; i++)
    {
        for (int j = 0; j < 8; j++)
        {
            printf("%d ", tabela[i][j]);
        }
        printf("\n");
    }
    */

    long int rez = 0;

    for (int i = 0; i < 8; i++)
    {
        for (int j = 0; j < 8; j++)
        {
            if (tabela[i][j] == 1)
                rez += (long int) powf(2, (64 - (i * 8) - (j + 1)));
        }
    }

    printf("%ld\n", rez);
    return 0;
}