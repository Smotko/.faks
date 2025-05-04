#include <stdio.h>
#include <math.h>

int postavitve(int n){
	int** tab = calloc(n,sizeof(int));
	for(int i = 0; i < n;i++){
		*tab = calloc(n,sizeof(int));
	}
	for(int z = 0; z <n*n;z++){
		for(int i = 0; i <n; i++){
			for(int j = 0; j<n; j++){
				if(tab[i][j] == 0){
					tab[i][j] = 1;
				}
			}
		}
	}
}

int main(){
	int n = 3;
	psotavitve(n);
}
