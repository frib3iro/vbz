#include <iostream>
using namespace std;

int main()
{
	cout << "int tem " << sizeof(int) << " bytes." << endl;
	cout << "short tem " << sizeof(short) << " bytes." << endl << endl;

	int numint;
	short numshort;
	cout << "int tem " << sizeof numint << " bytes." << endl;
	cout << "short tem " << sizeof numshort << " bytes." << endl;

	
	return 0;
}

