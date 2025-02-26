#include <stdio.h>
#include <stdbool.h>

int main(){
	int n;
	scanf("%d",&n);
	int a[n];
	bool b = true;
	
	for(int i = 0; i<n; i++){
		scanf("%d",&a[i]);
		if(i == 0)
			continue;
		if(a[i] != a[i-1])
			b = false;
	}
	
	printf("%d\n",b);
	return 0;
}


