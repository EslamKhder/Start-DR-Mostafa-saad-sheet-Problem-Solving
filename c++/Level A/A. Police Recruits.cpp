#include <bits/stdc++.h>
using namespace std;
int main(){
	int size;
	cin>>size; // 8
	int arr[size];
	for(int i=0;i<size;i++){
		cin>>arr[i]; // 2 -1 1 -1 -1 1 1 1 
	}
	int po = 0; // 0
	int issue = 0; // 0
	for(int i=0;i<size;i++){
		if(arr[i] == -1){
			if(po > 0){
				po--;
			} else {
				issue++;
			}
		} else {
			po+=arr[i];
		}
	}
	cout<<issue<<endl;
	
}
