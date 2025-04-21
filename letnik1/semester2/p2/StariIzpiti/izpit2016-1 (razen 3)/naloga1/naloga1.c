#include <stdio.h>
#include <stdlib.h>

int main()
{
    int p, q, st_ponovitev, stevilo, next;
    scanf("%d%d%d", &p, &q , &st_ponovitev);

    if (st_ponovitev == 0)
    {
        printf("%d\n", p * q);
        return 0;
    }

    stevilo = p * q;
    next = 0;
    for (int i = 0; i < st_ponovitev; i++)
    {
        next = 0;
        while (stevilo / 10 != 0)
        {
            next += stevilo % 10;
            stevilo = stevilo /10;
        }
        next += stevilo;
        stevilo = next;

    }

    printf("%d\n", next);


    return 0;
}