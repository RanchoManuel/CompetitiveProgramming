using namespace std;
#include <cstdio>
#include <iostream>

int main()
{
	int casos;cin >> casos;
	for(int c=1; c<=casos; c++)
	{
		int numCorredores;cin >> numCorredores;
		int max=0;
		while(numCorredores--)
		{
			int vEste;cin >> vEste;
			if(vEste>max)max=vEste;
		}
		cout << "Case " << c << ": " << max << endl;
	}

	return 0;
}
