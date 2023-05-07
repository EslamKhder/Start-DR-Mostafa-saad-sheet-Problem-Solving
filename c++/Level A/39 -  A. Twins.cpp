#include<bits/stdc++.h>
using namespace std;
string value = "qwertyuiopasdfghjkl;zxcvbnm,./";
int main(){
	char LR;
	cin>>LR;
	
	string input; 
	//  0123456789...
	// "s;;upimrrfod;pbr"
	cin>>input;
	
	for(int i=0;i<input.size();i++){ // i=0; i<16
		int index = value.find(input[i]);
		if(LR == 'L'){
			cout<<value[index+1];
		} else {
			cout<<value[index-1];
		}
	}
}
