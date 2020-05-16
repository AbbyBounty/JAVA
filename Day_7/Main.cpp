#include<iostream>
using namespace std;
void print( )
{
	static int count = 10;
	count = count + 1;
	cout<<"Count	:	"<<count<<endl;
}
int main( void )
{
	print( );	//11
	print( );	//12
	print( );	//13
	return 0;
}
