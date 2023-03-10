#include<bits/stdc++.h>
using namespace std;

int main()
{
	string num1,num2; 
	//  01   01
	// "16" "61"
	// "16" "61"
	
	while(cin>>num1>>num2){ // 12 12    5 5
		reverse(num1.begin(),num1.end());
		reverse(num2.begin(),num2.end());    // res[36,12,1]
		int res[500] = {0}; // 0  499
		for(int i=0;i<num1.size();i++){ // 1
			for(int z=0;z<num2.size();z++){ // 1
				res[i + z] += (num1[i] - '0') * (num2[z] - '0');
			}
		}
		for(int i=0;i<499;i++){ //1
		//      0 1 2
		// res[6,5,2]
			res[i+1] += res[i] / 10;
			res[i] %= 10;// res[i] = res[i] % 10;
		}
		//     0 1 2 3 4 5 6 7 .....499
		// res[6,5,2,0,0,0,0,0......0]
		int index = 499;
		while(index > 0 && res[index] == 0) index--;
		for(int i=index;i>=0;i--){
			cout<<res[i];
		}
		cout<<endl;
	}
}
