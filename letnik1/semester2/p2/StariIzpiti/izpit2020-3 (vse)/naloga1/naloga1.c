#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void razlike(FILE *prva, FILE *druga, FILE *izhod)
{
    char *string_prva = malloc(1001 * sizeof(char));
    char *string_druga = malloc(1001 * sizeof(char));
    int counter = 1;
    while (fgets(string_prva, 1001, prva) != NULL)
    {
        if (counter == 1)
            fgets(string_druga, 1001, druga);
            
        if (strcmp(string_prva, string_druga) != 0)
        {
            fprintf(izhod ,"%d", counter);
            if(fgets(string_druga, 1001, druga) != NULL)
                fputc('\n', izhod);
        }
        else
            fgets(string_druga, 1001, druga);

        counter++;
    }

}

int main(int agrc, char **argv)
{
    FILE *prva = fopen(argv[1], "r");
    FILE *druga = fopen(argv[2], "r");
    FILE *izhod = fopen(argv[3], "w");

    razlike(prva, druga, izhod);

    return 0;
}