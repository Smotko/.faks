#include <stdio.h>
#include <stdlib.h>

int main()
{
    char st_a[100001];
    char st_b[100001];

    for (int i = 0; i < 100001; i++)
    {
        st_a[i] = '0';
        st_b[i] = '0';
    }

    int dol_a = 1;
    int dol_b = 1;
    char trenutni;

    scanf("%c", &trenutni);
    while (trenutni != '\n')
    {
        st_a[dol_a] = trenutni;
        scanf("%c", &trenutni);
        dol_a++;
    }

    scanf("%c", &trenutni);
    while (trenutni != '\n')
    {
        st_b[dol_b] = trenutni;
        scanf("%c", &trenutni);
        dol_b++;
    }

    int naj_dolzina;
    if (dol_a > dol_b)
    {
        naj_dolzina = dol_a - 1;
        for (int i = naj_dolzina; i > 0; i--)
        {
            char element1 = st_a[dol_a - 1];
            char element2 = st_b[dol_b - 1];

            if (dol_a <= 0)
                element1 = '0';

            if (dol_b <= 0)
                element2 = '0';

            st_a[i] = element1 + element2 - '0';

            if (st_a[i] > '9')
            {
                st_a[i] = st_a[i] - 10;
                st_a[i - 1] += 1;
            }
            dol_a--;
            dol_b--;

        }

        if (st_a[0] != '0')
                printf("%c", st_a[0]);

        for (int i = 1; i <= naj_dolzina; i++)
        {
            printf("%c", st_a[i]);
        }
    }
    else
    {
        naj_dolzina = dol_b - 1;
        for (int i = naj_dolzina; i > 0; i--)
        {
            char element1 = st_a[dol_a - 1];
            char element2 = st_b[dol_b - 1];

            if (dol_a <= 0)
                element1 = '0';

            if (dol_b <= 0)
                element2 = '0';

            st_b[i] = element1 + element2 - '0';

            if (st_b[i] > '9')
            {
                st_b[i] = st_b[i] - 10;
                st_b[i - 1] += 1;
            }
            dol_a--;
            dol_b--;

        }

        if (st_b[0] != '0')
            printf("%c", st_b[0]);

        for (int i = 1; i <= naj_dolzina; i++)
        {
            printf("%c", st_b[i]);
        }
    }

    printf("\n");

    return 0;
}