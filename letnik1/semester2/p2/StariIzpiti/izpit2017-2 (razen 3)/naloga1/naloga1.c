#include <stdio.h>
#include <stdlib.h>

int main()
{
    char trenutno;
    char tabela[100000];
    int k;

    scanf("%c", &trenutno);
    int dolzina = 0; 
    while (trenutno != ' ')
    {
        tabela[dolzina] = trenutno;
        dolzina++;
        scanf("%c", &trenutno);
    }
    scanf("%d", &k);
    int rezultat = 0;
    int prenos = 0;
    char rez[dolzina];
    
    for (int i = dolzina - 1; i >= 0; i--)
    {
        rezultat = (((tabela[i] - '0') * k % 10 + prenos) % 10);
        prenos = (tabela[i] - '0') * k / 10 + (((tabela[i] - '0') * k % 10 + prenos) / 10);
        rez[i] = rezultat + '0';

    }

    if (prenos != 0)
        printf("%d", prenos);
        
    for (int i = 0; i < dolzina; i++)
        printf("%c", rez[i]);

    return 0;
}