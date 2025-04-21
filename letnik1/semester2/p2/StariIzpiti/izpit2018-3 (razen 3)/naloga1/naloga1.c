#include <stdio.h>
#include <stdlib.h>

int main()
{
    int st_iteracij;
    scanf("%d", &st_iteracij);
    
    char trenutno, prejsnje;
    scanf("%c", &trenutno);
    prejsnje = 0;

    for (int i = 0; i < st_iteracij; i++)
    {
        scanf("%c", &trenutno);

        if (prejsnje == 0)
            trenutno = trenutno - 'a' + 'A';

        if (prejsnje == '_' && trenutno >= 'a' && trenutno <= 'z')
            trenutno = trenutno - 'a' + 'A';
        printf("%c", trenutno);
        prejsnje = trenutno;
    }

    printf("\n");

    return 0;
}