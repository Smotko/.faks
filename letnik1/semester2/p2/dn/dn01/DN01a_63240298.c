#include <stdio.h>

int main(){

	int st1 = 0;
	int st2 = 0;
	int stevec = 0;
	int a = 1;
	int b = 1;
	char input;  
	
	while((input = getchar()) != '\n'){
	
		if(input == ' '){
			stevec ++;
			continue;
		}
		
		if(stevec == 0){
		
			if(input == '-'){
				a *= (-1);
				continue;
			}else{
				if(st1 > 0){
					st1 *= 10;
				}
				st1 += input - '0';
			}
		
		}else{
			if(input == '-'){
					b *= (-1);
					continue;
			}else{
				if(st2 > 0){
					st2 *= 10;
				}
				st2 += input - '0';
			}
			
		}
		
	}
	
	int output = (a * st1) + (b * st2);
	int outputCopy = output;
	int test = 1;
	char vmesni = 0;
	int stevec3 = 0;
	
	while(outputCopy > 9 || outputCopy < -9){
		test *= 10;
		outputCopy /= 10;
	}
	while(test > 0){
		if(output < 0 && stevec3 == 0){
			putchar('-');
			output *= (-1);
			stevec3++;
		}
		vmesni = output/test + '0';
		putchar(vmesni);
		output %= test;
		test /= 10;
	}
	putchar('\n');
}
