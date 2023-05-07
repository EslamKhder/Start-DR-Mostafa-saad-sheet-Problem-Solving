#include<bits/stdc++.h>
using namespace std;
int main(){
	int size; // 5
	cin>>size;
	int arr[size]; // 6 5 1 3 2
	for(int i=0;i<size;i++){
		cin>>arr[i];
	}
	sort(arr,arr+size);
	// 0 1 2 3 4
	// 1 2 3 5 6
	int counter = 0;
	for(int i =1;i<size-1;i++){// i<4
		if(arr[0]<arr[i] && arr[size-1] > arr[i]) counter++;
	}
	cout<<counter;
}
