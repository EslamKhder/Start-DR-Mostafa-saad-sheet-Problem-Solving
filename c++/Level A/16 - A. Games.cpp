#include<iostream>
using namespace std;
int main(){
	int size;
	cin>>size;
	int arr1[size];
	int arr2[size];
	int counter = 0;
	for(int i=0;i<size;i++){ 
		cin>>arr1[i];
		cin>>arr2[i];
	}
	for(int i=0;i<size;i++){
		for(int z=0;z<size;z++){
			if(arr1[i] == arr2[z] && i != z){
				counter++;
			}
		}
	}
	cout<<counter<<endl;
	
}
