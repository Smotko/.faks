#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int agrc, char **argv)
{
    FILE *vhod = fopen(argv[1], "r");
    FILE *izhod = fopen(argv[2], "w");
    
    char *temp = malloc(100 * sizeof(char));
    char **tabela = malloc(100 * sizeof(char *));
    int counter = 0;
    while (fgets(temp, 10000, vhod) != NULL)
    {
        if(counter == 0)
        {
            temp[strlen(temp) - 1] = '\0';
        }

        tabela[counter] = temp;
        counter++;
        temp = malloc(100 * sizeof(char));
    }
    
    int i = counter -1;

    while (i >= 0)
    {
        fprintf(izhod, "%s", tabela[i]);
        if (i == counter - 1)
            fputc('\n', izhod);

        i--;
    }

    fclose(vhod);
    fclose(izhod);
    free(temp);
    free(tabela);
}