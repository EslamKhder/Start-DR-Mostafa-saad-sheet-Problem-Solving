#include <bits/stdc++.h>
using namespace std;
int main(){
	map<int, int> box;
	cin>>box[1]; // 1
	cin>>box[2]; // 2
	cin>>box[3]; // 3
	cin>>box[4]; // 4
	string steps;
	cin>>steps;
	int res = 0;
	//  012345
	// "123214"   '1' '2' '3' '2' '1' '4'
	for(int i=0;i<steps.size();i++){ //  i<6   0 1 2 3 4 5
		res += box[steps[i] -48];
	}
	cout<<res;
}
