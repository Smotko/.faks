#include <stdio.h>
int vsotaPoModulu(int a,int b);

int main(){
	int a,b;
	scanf("%d%d",&a, &b);
	printf("%d + %d = %d \n",a,b,vsotaPoModulu(a,b));
	return 1;
}

int vsotaPoModulu(int a, int b){
	return a+b%10;
}

