#include <stdio.h>

int main(){

	unsigned long st = 0b0;
	int stevec = 0;
	char input = '0';
	
	while((input = getchar()) != '\n'){
		if(stevec > 0){
			st = st << 1;		
		}
		st += input - '0';
		stevec ++;
	}
	
	int des = 0;
	int stevec2 = 1;
	
	while(st > 0){
		des += (st%2)*stevec2;
		st /= 2;
		stevec2 *= 2;
	}
	
	int output = 0;
	int deljivo = 1;
	
	while(des > deljivo){
		output++;
		if(des%2 != 0)
			deljivo = 0;
		des/=2;
	}
	
	int test = 1;
	char vmesni = 0;
	int outputcopy = output;
	
	while(output > 9){
		test *= 10;
		output /= 10;
	}
	while(test > 0){
		vmesni = outputcopy/test + '0';
		putchar(vmesni);
		outputcopy %= test;
		test /= 10;
	}
	putchar('\n');
}
