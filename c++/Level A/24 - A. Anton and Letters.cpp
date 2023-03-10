#include<bits/stdc++.h>
using namespace std;
int main(){
	string value;  
	 //   012345678
	//    {a, b, c}   size = 9
	getline(cin, value);
	set<char> letters;
	
	for(int i=0;i<value.size();i++){
		if(value[i] != '{' && value[i] != '}' && value[i] != ' ' && value[i] != ','){
			letters.insert(value[i]);
		}
	}
	cout<<letters.size();
}
