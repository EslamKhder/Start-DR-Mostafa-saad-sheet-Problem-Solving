#include<bits/stdc++.h>
using namespace std;
int main()
{
	int steps,mod; // 3 5
	// 0 1 2 3 4
	//[1,1,1,1,1]
	// 0 3 1 4 2 3
	while(cin>>steps>>mod){
		int index = 0;
		int arr[mod] = {0};
		int bad = 0;
		for(int i=0;i<mod;i++){ // 0 1 2 3 4
			int newNumber = index+steps; // 3
			if(newNumber >= mod) newNumber %=mod; // newNumber = newNumber % mod
			if(arr[newNumber] == 1){
				bad = 1;
				break;	
			}
			arr[newNumber] = 1;
			index = newNumber;
		}
		cout<<setw(10)<<steps<<setw(10)<<mod<<"    "<<((bad == 1)?"Bad Choice":"Good Choice");
		cout<<endl<<endl;
	}
}
