#include <stdio.h>

int main(){
	typedef struct _node{
		int value;
		struct _node *next   ;
	}node;
	_node -> *next = node;
	for(int i = 0; i < 5; i++){
		_node -> value = i;
		_node -> *next = _node;
		//System.out.printf("%d",
	}
		
	return 0;
}
