#include<bits/stdc++.h>
using namespace std;
int main()
{
	long num;
	
	while(cin>>num && num != 0){
		long res = sqrt(num);
		cout<<(res * res == num ? "yes" : "no")<<endl;
	}
}
