#include <stdio.h>
#include <stdlib.h>

#define TABX 10
#define TABY 20
#define TABZ 30

int main(){
	int *** a;
	a = (int ***) malloc(TABX * sizeof(int**));
	for(int i = 0;  i < TABX; i++){
		a[i] = (int **) malloc(TABY * sizeof(int *));
		for(int j = 0; j < TABY; j++){
			a[i][j] = (int *) malloc (TABZ * sizeof(int));
		}
	}
	return 0;
}
