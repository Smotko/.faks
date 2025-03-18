#include <stdio.h>
#include <stdbool.h>

int main(){
	
	char znak = 0;
	int stevec = 0;
	int stevec2 =  0;
	int nacin = 0;
	bool jeOK = false;
	char preverjanje = '0';
	
	do{
		//preberemo znak
		znak = getchar();
		//preverjanje veljavnosti niza pred ' ', oziroma povecamo stevec na 1
		if(znak == ' ' || stevec == 0 || znak == '\n') {
			if(preverjanje == '1')
				jeOK = false;
			if(jeOK && stevec > 0)
				putchar('1');
			if(!jeOK && stevec > 0)
				putchar('0');
			stevec ++;
			jeOK = false;
			preverjanje = '0';
			nacin = 0;
			if(stevec != 1)
				continue;
		}
		//zacetek niza
		if(stevec != stevec2){
			if(znak > '0' && znak <= '9'){
				nacin = 1;
				jeOK = true;
			}else if(znak == '0'){
				nacin = 2;
				jeOK = true;
			}
		//naslednji znaki niza
		}else{	
			if(!jeOK){
				continue;
			}
			if(nacin == 1 && (znak < '0' || znak > '9')){
				jeOK = false;
			}else if(nacin == 3 && ((znak < '0' || znak > '9') && (znak < 'A' || znak > 'F'))){
				jeOK = false;
			}else if(nacin == 4 && znak != '0' && znak != '1'){
				jeOK = false;
			}else if(nacin == 3 || nacin == 4){
				preverjanje = '0';
			}else if(nacin == 2 && (znak < '0' || znak > '7')){
				jeOK = false;
				if(znak == 'x'){
					nacin = 3;
					jeOK = true;
					preverjanje = '1';
				}
				if(znak == 'b'){
					nacin = 4;
					jeOK = true;
					preverjanje = '1';
				}
			}
		}
		stevec2 = stevec;
	}while(znak != '\n');
	putchar('\n');
	return 0;
}
