#include <stdio.h>

#define MAX 5
#define USER "Anze" // + '\0'

int vsota(int a, int b){
	return a + b;
}

int mod(int a, int b){
	return a%b;
}

int shift(int a, int b){
	return a << b;
} 

int main(){
	int a = 0;
	int b = 0;
	scanf("%d%d",&a, &b);
	printf("A: %d, B: %d\n"
	"A + B = %d\n",
	a, b, vsota(a, b));
	if(b != 0)
		printf("A %% B = %d\n", mod(a,b));
	else
		printf("A %% B = Devision by zero\n");
	printf("A SL B = %d\n", shift(a, b));
	printf("%ld %p\n",sizeof(&a), &a); //%ld is for long
	if(vsota(a, b) <= MAX)
		printf("Vsota ne presega %d\n", MAX);
	printf("%s\n", USER);
	
	typedef struct node_s {  // Internal name required here
		int data;
		struct node_s* next;  // Can't use "Node" yet!
	} Node;
	Node n1 = {}
	
	return 0;
}
