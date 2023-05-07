#include<bits/stdc++.h>
using namespace std;
int main(){

	int size; // 4
	cin>>size;
	int arr[size]; // 3 2 1 2
	int sum = 0;//
	for(int i=0;i<size;i++){
		cin>>arr[i];
		sum += arr[i];
	} //sum = 8;
	sum /=2; // 4
	sort(arr,arr+size);
	// 0 1 2 3
	// 1 2 2 3
	int res = 0;
	int counter = 0;
	for(int i=size-1;i>=0;i--){ // i = 3 2
		 res += arr[i]; // 5
		 counter++; // 2
		 if(res > sum){
		 	break;
		 }
	}
	cout<<counter<<endl;
} 
