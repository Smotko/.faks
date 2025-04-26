#include <stdio.h>
#include <stdlib.h>

int skoki(int cilj, int k1, int k2, int st_skokov)
{
    if (st_skokov == 0 || cilj < 0)
        return 0;
    return skoki(cilj - k1, k1, k2, st_skokov - 1);
    return skoki(cilj - k2, k1, k2, st_skokov - 1);
}


int main()
{
    int cilj, k1, k2, st_skokov;

    scanf("%d%d%d%d", &cilj, &k1, &k2, &st_skokov);

    printf("%d\n", skoki(cilj, k1, k2, st_skokov));
    return 0;
}