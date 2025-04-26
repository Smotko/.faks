#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char *tabela = malloc(1001 * sizeof(char));
    scanf("%s", tabela);
    int length = strlen(tabela);
    int pogoj = 0;
    
  
    while (length >= 0)
    {
        if(length % 3 == 0 && length != 0 && pogoj == 1)
            printf(".");

        printf("%c", *tabela);

        pogoj = 1;
        tabela++;
        length--;
    }
    
    printf("\n");

    return 0;
}