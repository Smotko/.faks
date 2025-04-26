#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Oseba Oseba;
struct Oseba { // oseba s podanim imenom in starostjo
    char* ime; // zaporedje do 20 črk angleške abecede
    int starost;
};

void swap(Oseba *prva, Oseba *druga)
{
    char *temp_ime = prva->ime;
    int temp_starost = prva->starost;

    prva->ime = druga->ime;
    druga->ime = temp_ime;

    prva->starost = druga->starost;
    druga->starost = temp_starost;
}

void uredi(Oseba **osebe, int n)
{
    for (int i = 0; i < (n - 1); i++)
    {
        for (int j = 0; j < (n - i - 1); j++)
        {
            if (strcmp(osebe[j]->ime, osebe[j + 1]->ime) > 0)
            {
                swap(osebe[j], osebe[j + 1]);
            }
        }
    }
}

int main()
{
    Oseba **osebe = malloc(6 * sizeof(Oseba *));

    for (int i = 0; i < 6; i++)
    {
        Oseba *trenutna = malloc(sizeof(Oseba));
        osebe[i] = trenutna;
    }

    osebe[0]->ime = "Bojan";
    osebe[0]->starost = 30;
    osebe[1]->ime = "Ana";
    osebe[1]->starost = 25;
    osebe[2]->ime = "Bojan";
    osebe[2]->starost = 40;
    osebe[3]->ime = "Cene";
    osebe[3]->starost = 15;
    osebe[4]->ime = "Bojan";
    osebe[4]->starost = 20;
    osebe[5]->ime = "Ana";
    osebe[5]->starost = 20;

    uredi(osebe, 6);

    for (int i = 0; i < 6; i++)
        printf("%s, %d\n", osebe[i]->ime, osebe[i]->starost);

    for (int i = 0; i < 6; i++)
        free(osebe[i]);
    
    free(osebe);

    return 0;
}