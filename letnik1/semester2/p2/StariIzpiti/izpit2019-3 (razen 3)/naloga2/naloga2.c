#include <stdio.h>
#include <stdlib.h>

int main()
{
    // Polnjenje tabele
    int st_iteracij;
    scanf("%d", &st_iteracij);
    char trenutni;
    int visina = 0;
    int trenurna_visina = 0;

    char tabela[st_iteracij];

    for (int i = 0; i < st_iteracij + 1; i++)
    {
        scanf("%c", &trenutni);
        tabela[i] = trenutni;

        if (trenutni == 'G')
            trenurna_visina++;
        else
            trenurna_visina--;

        if (trenurna_visina > visina)
            visina = trenurna_visina;
    }

    // Izpis
    for (int j = visina ; j > 0; j--)
    {
        trenurna_visina = 0;
        for (int i = 0; i < st_iteracij; i++)
        {
            trenutni = tabela[i];
            if (trenutni == 'G')
                trenurna_visina++;
            else
                trenurna_visina--;

            if ((trenurna_visina != j && trenutni == 'G') || (trenurna_visina + 1 != j && trenutni == 'D'))
                printf(".");
            else
            {
                if (trenutni == 'G')
                {
                    printf("/");
                }
                else
                   printf("\\");
            }
        }
        printf("\n");
    }

    return 0;
}