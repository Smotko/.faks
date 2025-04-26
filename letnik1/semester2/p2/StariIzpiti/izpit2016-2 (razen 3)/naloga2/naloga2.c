#include <stdio.h>
#include <stdlib.h>

int main()
{
    int p, q, gorivo, trenutno;
    scanf("%d%d%d", &p, &q, &gorivo);
    int tabela[p][q];

    for (int i = 0; i < p; i++)
    {
        for (int j = 0; j < q; j++)
        {
            scanf("%d", &trenutno);
            tabela[i][j] = trenutno;
        }
    }

    int counter = 0;
    int x1, y1, x2, y2;
    while (gorivo >= 0)
    {
        for (int i = 0; i < p; i++)
        {
            for (int j = 0; j < q; j++)
            {
                if (tabela[i][j] == counter)
                {
                    x1 = i;
                    y1 = j;
                }

            }
        }
        for (int i = 0; i < p; i++)
        {
            for (int j = 0; j < q; j++)
            {
                if (tabela[i][j] == (counter + 1))
                {
                    x2 = i;
                    y2 = j;
                }

            }
        }

        x1 = x1 - x2;
        y1 = y1 - y2;

        if(x1 < 0)
            x1 = -1 * x1;

        if(y1 < 0)
            y1 = -1 * y1;

        gorivo = gorivo - x1 -y1;

        if (gorivo >= 0)
            counter++;
    }

    printf("%d\n", counter);

    return 0;
}