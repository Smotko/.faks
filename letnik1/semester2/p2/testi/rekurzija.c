#include <stdio.h>
#include <stdlib.h>

#define LEN 100
#define STPER 7
int nums[LEN];
//permutacije 
void permutacije(int * ns, int n){
	if(n == 1){
		for(int i = 0; i < STPER; i++){
			printf("%d ", ns[i]);
		}
		printf("\n");
	}else{
		for(int i = 0; i < n; i ++){
			int tmp;
			tmp = ns[0];
			ns[0] = ns[i];
			ns[i] = tmp;    
			permutacije(&ns[1], n-1);
			tmp = ns[0];
			ns[0] = ns[i];
			ns[i] = tmp;
		}
	}
}
int main(){
	for (int i = 0; i < LEN; i++){
		nums[i] = i;
	}
	permutacije(nums,STPER);
	return 0;
}
