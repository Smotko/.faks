#include <stdio.h>
#include <stdlib.h>

int main()
{
    int stevila[10];
    long int prvo, drugo;
    scanf("%ld%ld", &prvo, &drugo);

    for (int i = 0; i < 10; i++)
        stevila[i] = 0;

    while(prvo / 10 != 0)
    {
        stevila[prvo % 10]++;
        prvo = prvo / 10;
    }
    stevila[prvo % 10]++;

    while(drugo / 10 != 0)
    {
        stevila[drugo % 10]++;
        drugo = drugo / 10;
    }
    stevila[drugo % 10]++;

    int counter = 0;
    for (int i = 0; i < 10; i++)
    {
        if(stevila[i] != 0)
            counter++;
    }

    printf("%d\n", counter);

    return 0;
}