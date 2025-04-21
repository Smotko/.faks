#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
    FILE *vhod = fopen(argv[1], "rb");
    int counter = 0;
    
    while (fgetc(vhod) != EOF)
        counter++;
        
    if (counter == sizeof(short))
        printf("0\n");
    else
        printf("1\n");

    fclose(vhod);

    return 0;
}