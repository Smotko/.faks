#include <stdio.h>

int main(){
	int a = 0;
	int b = 0;
	scanf("%d", &a);
	scanf("%d", &b);
	
	int stevec = (a + b) /2;
	int min = a;
	int max = b;
	int input = 0;
	int mode = 0;
	
	while(1){
		 scanf("%d", &input);
		 if(input==0){
		 	break;
		 }else if(input == 1){
		 	min = stevec + 1;
		 	a = stevec;
		 	stevec = (stevec + b) /2;
		 }else{
		 	max = stevec - 1;
		 	b = stevec;
		 	stevec = (stevec + a) /2;
		 }
		 
		 if(min == max){
		 	mode = 1;
		 }else if(min < max){
		 	mode = 2;
		 }else{
		 	mode = 3;
		 }
	}
	
	if(mode == 1){
		printf("%d\n", stevec);
	}else if(mode == 2){
		printf("%d %d\n", min, max);
	}else{
		printf("PROTISLOVJE\n");
	}

}
