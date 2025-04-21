#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int st_iteracij;
// ni memoizacije vsi testni primeri ne delajo! n > 30

int gorovja(int n, int visina)
{
    if (visina < 0 || visina > st_iteracij/2)
        return 0;

    if (st_iteracij == visina)
        return 1;

    if (st_iteracij == n)
    {
        if (visina == 0)
        {
            return 1;
        }
        return 0;
    }

    int vsota = 0;
    vsota += gorovja(n + 1, visina + 1) + gorovja(n + 1, visina - 1);    

    return vsota;
}

int main()
{
    scanf("%d", &st_iteracij);

    printf("%d\n", gorovja(0, 0));

    return 0;
}