#include <stdio.h>

int main(){

	int st = 0;
	int des = 0;
	int stevec = 0;
	char input;  
	
	while((input = getchar()) != '\n'){
	
		if(stevec > 0){
			st *= 10;		
		}
		st += input - '0';
		stevec ++;
	}
	
	int stevec2 = 1;
	while(st > 0){
		des += (st%10)*stevec2;
		st /= 10;
		stevec2 *= 2;
	}
	
	int output = 0;
	while(des > 1){
		output++;
		des/=2;
	}
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
