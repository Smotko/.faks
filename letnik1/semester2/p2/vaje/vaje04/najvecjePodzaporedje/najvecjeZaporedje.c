#include <stdio.h>
#include <stdbool.h>
#include <limits.h>

#define MAKS_DOLZINA 1000000
int tabela[MAKS_DOLZINA];

int main(){

	int n = 0;
	scanf("%d",&n);
	int vmesni = 0;
	int max = INT_MIN;
	
	for(int i = 0; i < n; i++){
		scanf("%d", &tabela[i]);
	}
	/* NAIVNA RESITEV
	
	for(int i = 0; i < n; i++){
		for(int j = i; j < n; j++){
			vmesni += tabela[j];
			if(vmesni > max)
				max = vmesni;
			
		}
		vmesni = 0;
	}
	*/
	for(int i = 0; i < n; i++){
		vmesni += tabela[i];
		/*
		if(vmesni < 0 && tabela[i] >= 0){
			vmesni = 0;
			if(max < tabela[i])
				max = tabela[i];
			continue;
		}*/
		if(vmesni > max)
			max = vmesni;
		if(vmesni < 0){
			vmesni = 0;
		}
	}
	
	printf("%d\n", max);
	
	return 0;
}
