#include<bits/stdc++.h>
using namespace std;
int size; /// 6
char arr[30][30];
int visit[30][30];
int x[] = {0,0,-1,1,-1,-1,1,1};
int y[] = {1,-1,0,0,1,-1,1,-1};
bool isValid(int row,int column){
	return row >= 0 && column >= 0 && row < size && column < size;
}

void cancel(int row,int column){ // 1 2   -1 -1
	
	if(visit[row][column]){
		return;
	}
	visit[row][column] = 1;
	
	for(int i=0;i<8;i++){ // 0 1 2 3 4 5 6 7
		int r = row + x[i];
		int c = column + y[i]; // 0 1
		
		if(isValid(r,c) && !visit[r][c] && arr[r][c] == '1'){
			cancel(r,c);
		}
	}
}
int main()
{
	int testCase = 1;
	while(cin>>size){
		for(int i=0;i<size;i++){
			for(int z=0;z<size;z++){
				cin>>arr[i][z];
			}
		}
		memset(visit,0,sizeof(visit));
		int process = 0;
		for(int i=0;i<size;i++){
			for(int z=0;z<size;z++){
				if(!visit[i][z] && arr[i][z] == '1'){
					cancel(i,z);
					process++;
				}
			}
		}
		
		cout<<"Image number "<<testCase++<<" contains "<<process<<" war eagles."<<endl;
	}
}





