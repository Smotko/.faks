#include <stdio.h>
#include <limits.h>

#define DOLZINA_TABELE INT_MAX

int strLen(char *str);

char str[DOLZINA_TABELE];

int main(){
	int ix = 0;
	char znak = '0';
	while(1){
		scanf("%c", &znak);
		if(znak != '\n')
			str[ix] = znak;
		else{
			str[ix] = '\0';
			break;
		}
		ix ++;
	}
	printf("%d\n", strLen(str));
	return 0;
}

int strLen(char *str){
	if(str[0] == '\0')
		return 0;
	else{
		int rest = strLen(&str[1]);
		//int rest = strLen(str + 1); same
		return 1 + rest;
	}
}
