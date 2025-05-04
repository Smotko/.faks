#include <stdio.h>

int main(){
	int tab[4][3] = {{1,2,3},{2,3,4},{5,6,7},{8,9,0}};
	
	for(int i = 0; i < 4; i++){
		for(int j = 0; j < 3; j++){
			//printf("%d ", tab[i][j]);
			//size(int) is redundant !
			//printf("%p\n", &tab[0][0] + 3*i*sizeof(int)) +j;
			printf("%p\n", &tab[0][0] + 3*i +j);
		}
		printf("\n");
	}
}
