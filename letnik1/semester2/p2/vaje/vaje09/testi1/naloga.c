#include <stdio.h>

void nizi(int n, char c1, char c2){
	char izpis[n];
	int nivo = 0;
	while(c1 <= c2){
		
		System.out.printf("%s", izpis);
		c1++;
	}
}

int main() {
	int n; //[1,20];
	char c1;
	char c2;
	scanf("%d",&n); // lahko scanf("%d %c %c...
	scanf("%c",&c1);
	scanf("%c",&c2);
	nizi(n,c1,c2);
	//printf("%d\n", dolzinaNiza(niz));
    return 0;
}
