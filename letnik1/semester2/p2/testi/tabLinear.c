#include <stdio.h>
#include <stdlib.h>

#define N 3
#define M 4
#define LEN 16


char s[] = "0123456789ABCDEF";
int main(){
	char * p = s;
	for(int i = 0; i < LEN; i++)
		printf("%c ",p[i]);
	printf("\n"); 
	char (*pp)[M] = (char(*)[N]) s;
			
	for(int i = 0;  i < N; i++){
		for(int j = 0; j < M; j++){
			printf("%c ", pp[i][j]);
		}
		printf("\n");
	}
	return 0;
}
