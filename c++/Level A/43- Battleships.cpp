#include<bits/stdc++.h>
using namespace std;

int si;//4
char arr[200][200];
int v[200][200];

bool isValid(int x,int y){//0 0
	return x >= 0 && x < si && y >= 0 && y < si;
}

void run(int x,int y){//0 0     0 1
	if(!isValid(x,y)) {
		return;
	}
	if(arr[x][y] == '.' || v[x][y]){
		return;
	}
	v[x][y] = 1;
	
	run(x,y+1);
	run(x,y-1);
	run(x-1,y);
	run(x+1,y);
}
int main(){
	int testCases;//2
	cin>>testCases;
	
	int cases = 1;
	while(testCases--){ // 2 1
		cin>>si;
		
		memset(v,0,sizeof v);
		for(int i=0;i<si;i++){
			for(int z=0;z<si;z++){
				cin>>arr[i][z];
			}
		}
		
		int counter = 0;
		for(int i=0;i<si;i++){
			for(int z=0;z<si;z++){
				if(v[i][z] != 1 && arr[i][z] == 'x'){
					counter++;
					run(i,z);
				}
			}
		}
		
		cout<<"Case "<<cases++<<": "<<counter<<endl;
		
	}
	
}
