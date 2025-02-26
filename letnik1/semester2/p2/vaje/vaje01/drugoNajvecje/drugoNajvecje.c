#include <stdio.h>

int main(){
	int n;
	scanf("%d",&n);
	int a[n];
	int d;
	int max;
	int min;
	
	
	for(int i = 0; i < n; i++){
		scanf("%d",&a[i]);
		if(i == 0)
			continue;
		if(i == 1){
			if(a[i] < a[i-1]){
				d = a[i];
				min = a[i];
				max = a[i-1];
				
			}else{
				d = a[i-1];
				min = a[i-1];
				max = a[i];
			}
		}
		if(i >= 2){
			if(a[i] > d){
				if(a[i] > max){
					d = max;
					max = a[i];
				}else{
					d = a[i];
				}
			}	
		}
			
			
	}
 	printf("%d",d);
	return 0;
}
