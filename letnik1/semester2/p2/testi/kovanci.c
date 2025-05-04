#include <stdio.h>
#include <math.h>

int VREDNOST = 0;
//kovanci 1c[1],2c[2],5c[3],10c[4],20c[5],50c[6],1€[7],2€[8]

int kombinacije(int znesek, int stKovancev){
	int kovanec[9]={0,1,2,5,10,20,50,100,200};
	
	if(stKovancev == 1){
	//printf("%d ",stKovancev);
		VREDNOST+= 1;
		return 1;
	}else{
		int n = 0;
		int stNacinov = 0;
		while(n*kovanec[stKovancev] <= znesek){
		
			stNacinov += kombinacije(znesek-n*kovanec[stKovancev], stKovancev-1);
			n++;
		}
		//printf("%d ",stKovancev);
		return stNacinov;
	}
}

int iterativno(int sum, int max_coin){
	int coins[9]={0,1,2,5,10,20,50,100,200};
	int sums[9];
	int max_coins[9];
	int num_ways[9];
	int ns[9];
	sums[max_coin] = sum;
	max_coins[max_coin] = max_coin;
	num_ways[max_coin] = 0;
	ns[max_coin] = 0;
	
	int r = max_coin;
	do{
		if(r == 1){
			num_ways[r+1] += 1;
			r+=1;   
		}else{
			if(ns[r]*coins[r] <= sums[r]){
				sums[r-1] = sums[r]-ns[r]*coins[r];
				max_coins[r-1] = max_coins[r]-1;
				num_ways[r-1] = 0;
				ns[r-1] = 0;
				ns[r] += 1;
				r -= 1;
			}else{
				num_ways[r+1] += num_ways[r];
				r += 1;
			}
		}
	}while(r <= max_coin);
	return num_ways[r-1];
}

int main(){
	int znesek = 1000;
	int stKovancev = 8;
	//int stKomb = 0;
	printf("%d\n",kombinacije(znesek, stKovancev));
	printf("%d\n",VREDNOST);
	printf("%d\n",iterativno(znesek, stKovancev));
}
