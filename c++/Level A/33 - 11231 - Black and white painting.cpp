#include<bits/stdc++.h>
using namespace std;
int main()
{
	int row,column,start;
	while(cin>>row>>column>>start && row != 0){
		cout<<((row - 7) * (column - 7) + start) / 2<<endl;
	}

	
	
}
