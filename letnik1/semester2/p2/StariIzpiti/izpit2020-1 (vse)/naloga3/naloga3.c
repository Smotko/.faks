#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int st_iteracij;

void podmnozice(int *stevila, int poz, int len, int *pod)
{
    if (poz == st_iteracij)
    {
        printf("{");
        for (int i = 0; i < len - 1; i++)
            printf("%d, ", pod[i]);
        if (len != 0)
        {
            printf("%d", pod[len - 1]);
        }
        printf("}\n");
        return;
    }
    pod[len] = stevila[poz];
    podmnozice(stevila, poz + 1, len + 1, pod);
    podmnozice(stevila, poz + 1, len, pod);


}


int main()
{
    int trenutno;
    scanf("%d", &st_iteracij);
    int pod[st_iteracij];

    memset(pod, 0, st_iteracij);
    int stevila[st_iteracij];

    for (int i = 0; i < st_iteracij; i++)
    {
        scanf("%d", &trenutno);
        stevila[i] = trenutno;
    }

    podmnozice(stevila, 0, 0, pod);

    return 0;
}