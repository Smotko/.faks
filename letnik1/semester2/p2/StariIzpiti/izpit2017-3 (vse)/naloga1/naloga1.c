#include <stdio.h>
#include <stdlib.h>

int main()
{
    int trenutno;
    int prejsnje = 0;
    char pogoj;

    scanf("%d", &trenutno);
    scanf("%c", &pogoj);

    while (pogoj != '\n')
    {
        if (prejsnje == 0)
            prejsnje = trenutno;

        if (trenutno > 0 && prejsnje < 0)
            printf("%d\n", prejsnje);

        if (trenutno < 0 && prejsnje > 0)
            printf("%d\n", prejsnje);

        prejsnje = trenutno;
        scanf("%d", &trenutno);
        scanf("%c", &pogoj);
    }

    printf("%d\n", trenutno);

    return 0;
}