#include <stdio.h>

int main(){
	auto int c;
	c = getchar();
	while (c != EOF){
		putchar(c);
		c = getchar();
	}
}
