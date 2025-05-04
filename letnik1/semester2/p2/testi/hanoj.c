#include <stdio.h>
#include <math.h>

/*void hanoi1(char t1, char t2, char t3){
	printf("%c => %c\n", t1,t3);
}*/
void hanoi(char t1, char t2, char t3, int n){
	if(n == 1){
		printf("%c => %c\n", t1,t3);
	}else{
		hanoi(t1,t3,t2,n-1);
		printf("%c => %c\n", t1,t3);
		hanoi(t2,t1,t3,n-1);
	}
	
	/*
	for(int i = 2; i < pow(2,n) - 1, i++){
		hanoi1(t1,t2,t3);
		t1 =
	}
	
	for (int i = 2; i <=n; i++){
		printf("void hanoi%d(char t1, char t2, char t3){hanoi%d(t1,t3,t2);hanoi1(t1,t3,t2);hanoi%d(t1,t3,t2);\n",i,i-1,i-1);
		
	}*/
}

int main(){
	hanoi('a','b','c', 6);
}
