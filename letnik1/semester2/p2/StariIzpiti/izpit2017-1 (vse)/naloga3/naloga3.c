#include <stdio.h>
#include <stdlib.h>

int start[18];
int stop[18];
int st_iteracij;

void stevila(int stevilo, int pozicija)
{
    if (pozicija >= st_iteracij)
    {
        printf("%d\n", stevilo);
        return;
    }

    for (int i = start[pozicija]; i <= stop[pozicija]; i++)
        stevila(stevilo * 10 + i, pozicija + 1);
}

int main()
{
    scanf("%d", &st_iteracij);
    for (int i = 0; i < st_iteracij; i++)
        scanf("%d%d", &start[i], &stop[i]);

    stevila(0, 0);

    return 0;
}