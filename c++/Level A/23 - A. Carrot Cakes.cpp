#include<iostream>
using namespace std;
int main(){
	int cakes,t1,mCakes,t2;
	cin>>cakes>>t1>>mCakes>>t2;
	int res = (t1+t2) / t1;
	if(res * mCakes < cakes) {
		cout<<"YES"<<endl;
	} else {
		cout<<"NO"<<endl;
	}
}
