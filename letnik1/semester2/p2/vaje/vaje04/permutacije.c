#include <stdio.h>
#include <stdbool.h>

bool preverjanje[1000000];
int main(){

	int n = 0;
	scanf("%d",&n);
	int tabela[n];
	bool izpis = false;
	for(int i = 0; i < n; i++){
		scanf("%d", &tabela[i]);
		if(preverjanje[tabela[i]] == true || tabela[i] >= n || tabela[i] < 0){
			izpis = true;
		}
			preverjanje[tabela[i]] = true;
	}
	if(izpis){
		printf("NE\n");
	}else{
		printf("DA\n");
	}
	
	return 0;
}
