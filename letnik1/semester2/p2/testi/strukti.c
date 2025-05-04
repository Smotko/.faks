#include <stdio.h>

struct{ //opis tipa
	int x;
	int y;
}	point; //spremenljivka

//struct ime{}; struct ime = point; struct ime *pime; 
// . ima prednost od *
// pime -> x = 17;

int main(){
	point.x = 10;
	point.y = 100;
	struct ime{
		int x;
		int y;
		char ime[14]; //16b zaradi aligmenta compilerja
	};   
	struct ime * point2;
	printf("%d,%d\n",point.x,point.y);
	printf("%ld\n",sizeof(struct ime));
}
