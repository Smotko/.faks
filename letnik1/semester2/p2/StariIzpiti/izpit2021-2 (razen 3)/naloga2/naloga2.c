#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
    FILE *vhod = fopen(argv[1], "rb");
    int byte;
    int stevilo = 0;
    int nadaljuj = 0;

    while(byte != EOF)
    {
        byte = fgetc(vhod);

        if (nadaljuj)
            stevilo = stevilo << 7 | (byte >> 1);
        else
            stevilo = byte >> 1;

        nadaljuj = (byte & 1) != 0;

        if (!nadaljuj)
            printf("%d\n", stevilo);

    }

    fclose(vhod);

    return 0;
}