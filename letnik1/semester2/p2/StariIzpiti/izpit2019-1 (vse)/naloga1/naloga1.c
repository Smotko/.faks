#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char **argv)
{
    FILE *vhod = fopen(argv[1], "r");
    FILE *izhod = fopen(argv[2], "w");
    char poseben = *(argv[3]);

    char *vrstica = malloc(1000 * sizeof(char));
    char *print = malloc(1000 * sizeof(char));
    while(fgets(vrstica, 1000, vhod))
    {
        for (int i = 0; i < strlen(vrstica); i++)
        {
            if (vrstica[i] == poseben)
                strcpy(print, vrstica);
        }
    }

    fprintf(izhod, "%s", print);

    free(vrstica);

    return 0;
}