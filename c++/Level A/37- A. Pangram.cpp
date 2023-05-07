#include<bits/stdc++.h>
using namespace std;
int main(){
	int size;
	cin>>size;//5
	if(size < 26){
		cout<<"NO"<<endl;
		return 0;
	}
	char arr[size];// ['z','d','c','s','l'] ['c','d','s','z','l'] 
	for(int i=0;i<size;i++){
		char c;
		cin>>c;
		arr[i] = towlower(c);//"F"  "f"
	}
	sort(arr,arr+size);
	int cou = 0;
	for(int i=0;i<size;i++){
		if(arr[i] != arr[i+1]){
			cou++;
		}
	}
	if(cou == 26){
		cout<<"YES"<<endl;
	} else {
		cout<<"NO"<<endl;
	}
}
