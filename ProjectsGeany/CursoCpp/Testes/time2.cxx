#include <iostream>
#include <chrono>
using namespace std;
using namespace std::chrono;

int main()
{
	auto start = steady_clock::now();
	for (int i = 0; i <= 1000000; i++)
	{
		cout << i << " ok\r";
	}
	auto end = steady_clock::now();

	auto elapsed = end - start;

	cout << endl << endl;
	
	cout << duration<double>{elapsed}.count() << " segundos" << endl;
	
	cout << elapsed.count() << " nano segundos";
	
}

