#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool prastevilo(int n)
{
    for (int j = 2; j < n; j++)
    {   
        if (n % j == 0)
        {
            return false;
        }
    }

    return true;
}

int main()
{
    int n, k;
    scanf("%d%d", &n, &k);
    for (int i = 0; i < k; i++)
    {
        bool pogoj = false;

        while (pogoj == false)
        {
            n++;
            pogoj = prastevilo(n);
        }
    }

    printf("%d\n", n);

    return 0;
}