#include <stdio.h>
#include <stdlib.h>

struct Vozlisce
{
    struct Vozlisce *naslednje;
    int vrednost;
};

struct Vozlisce *prepisi(int *t)
{
    struct Vozlisce *prvo = malloc(sizeof(struct Vozlisce));
    prvo->naslednje = NULL;
    prvo->vrednost = 0;
    
    // bubble sort
    int counter = 0;
    int *p = t;
    while (*p != 0)
    {
        p++;
        counter++;
    }
    //printf("%d", counter);

    for (int i = 0; i < counter; i++)
    {
        for (int j = 0; j < counter; j++)
        {
            if(t[i] < t[j])
            {
                int temp = t[j];
                t[j] = t[i];
                t[i] = temp;
            }
        }
    }

    if (t[0] == 0)
        return NULL;

    struct Vozlisce *prejsnje = malloc(sizeof(struct Vozlisce));
    prejsnje = prvo;
    prejsnje->vrednost = t[0];
    int i = 1;

    while (i < counter)
    {
        struct Vozlisce *novo = malloc(sizeof(struct Vozlisce));
        prejsnje->naslednje = novo;
        novo->vrednost = t[i];
        prejsnje = novo;
        i++;
    }
    return prvo;
}

int main()
{
    int *t = malloc(6 * sizeof(int));

    t[0] = 1;
    t[1] = 3;
    t[2] = 5;
    t[3] = 1;
    t[4] = 0;
    t[5] = '\0';
    
    struct Vozlisce *izpis = prepisi(t);
    while (izpis != NULL)
    {
        printf("%d ", izpis->vrednost);
        izpis = izpis->naslednje;
    }
    return 0;
}
