#include <stdio.h>
#include <stdbool.h>

int main(){
	
	char znak = 0;
	int stevec = 0;
	int stevec2 =  0;
	int nacin = 0;
	bool jeOK = false;
	bool preverjanje3 = false;
	
	do{	
		//preberemo znak
		znak = getchar();
		//preverjanje veljavnosti niza pred ' ', oziroma povecamo stevec na 1
		if(znak == ' ' || stevec == 0 || znak == '\n') {
			if(preverjanje3)
				jeOK = false;
			preverjanje3 = false;
			if(jeOK && stevec > 0)
				putchar('1');
			if(!jeOK && stevec > 0)
				putchar('0');
			stevec ++;
			jeOK = false;
			if(stevec != 1)
				continue;
		}
		//zacetek niza
		if(stevec != stevec2){
			if(znak == '0'){
				nacin = 1;
				jeOK = true;
			}else if(znak > '0' && znak <= '9'){
				nacin = 2;
				jeOK = true;
			}else if(znak == '-' || znak == '+'){
				nacin = 3;
				jeOK = true;
				preverjanje3 = true;
			}
		//naslednji znaki niza
		}else{
			if(!jeOK)
				continue;
			if(nacin == 1 && znak != '\n'){
				jeOK = false;
			}else if(nacin == 2 && (znak < '0' || znak > '9')){
				jeOK = false;
			}else if(nacin == 3 && (znak <= '0' || znak > '9')){
				jeOK = false;
				if(znak == '0')
					jeOK = true;
			}
			preverjanje3 = false;
		}
		stevec2 = stevec;
	}while(znak != '\n');
	putchar('\n');
	return 0;
}
