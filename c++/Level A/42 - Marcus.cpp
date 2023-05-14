#include<bits/stdc++.h>
using namespace std;
int row,column;
string word = "IEHOVA#";
string steps[] = {"right", "left", "forth"};
int x[] = {0,0,-1};
int y[] = {1,-1,0};
int main(){
	int testCases;//2
	cin>>testCases;
	
	while(testCases--){ //  2 1
		
		cin>>row>>column;
		int r1,c1,r2,c2;
		
		char arr[row][column];
		for(int i=0;i<row;i++){
			for(int z=0;z<column;z++){
				cin>>arr[i][z];
				if(arr[i][z] == '@'){
					r1 = i; //5
					c1 = z; // 1
				}
				if(arr[i][z] == '#'){
					r2 = i; // 0
					c2 = z;// 3
				}
			}
		}
		int index = 0;
		vector<string> res;
		while(r1 != r2 || c1 != c2){ // 2 2 3 3
			for(int i=0;i<3;i++){ // 0 1 2
				int newX = r1 + x[i]; // 4
				int newY = c1 + y[i]; // 1
				if(arr[newX][newY] == word[index]){
					r1 = newX;
					c1 = newY;
					index++;
					res.push_back(steps[i]);
					break;
				}
			}
			
		}// res [forth forth right right forth forth forth]
			cout<<res[0];
			for(int i=1;i<res.size();i++){
				cout<<" "<<res[i];
			}
		cout<<endl;
	}
}
