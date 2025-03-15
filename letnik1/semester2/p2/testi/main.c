#include <stdio.h>
int racun(int a,int b);

int main(){
	int a,b;
	scanf("%d%d",&a, &b);
	printf("%d + %d = %d \n",a,b,racun(a,b));
	return 1;
}

int racun(int a, int b){
	return a+b;
}

