#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char *stevilo = malloc(10000 * sizeof(char));
    int dolzina;

    scanf("%s", stevilo);
    dolzina = strlen(stevilo);
    
    int k;
    scanf("%d", &k);

    char *rez = malloc(10000 * sizeof(char));
    int ostanek = 0;
    int deljenje = 0;

    for (int i = 0; i < dolzina; i++)
    {
        deljenje = (ostanek * 10 + (stevilo[i] - '0')) / k;
        ostanek = (ostanek * 10 + (stevilo[i] - '0')) % k;
        rez[i] = deljenje + '0';
    }


    int skip = 0;
    while (rez[skip] == '0')
            skip++;


    for (int i = skip; i < dolzina; i++)
    {

        printf("%c", rez[i]);
    }

    printf("\n");


    free(stevilo);
    free(rez);
    return 0;
}