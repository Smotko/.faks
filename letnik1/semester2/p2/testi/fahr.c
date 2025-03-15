#include <stdio.h>

int main(){
    float fahr, celsius;
    int upper, lower, step;

    lower = 0;
    upper = 300;
    step = 1;

    fahr = lower;
    while(fahr <= upper){
        celsius = 5 * (fahr-32) /9;
        printf("%d\t%f\n",(int)fahr,celsius);
        fahr += step;
    }

}
