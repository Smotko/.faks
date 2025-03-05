#include <stdio.h>

int main(){
	int m = 0;
	int n = 0;
	scanf("%d", &m);
	scanf("%d", &n);
	
	int stevec = 0;
	
	for(m; m <= n; m++){
		for(int a = 0; a < m; a++){
			for(int b = 0; b < a; b++){
				if(a*a + b*b == m*m)
					stevec++;
			}
		}
	}
	
	printf("%d\n", stevec);
}
