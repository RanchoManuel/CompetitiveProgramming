using namespace std;
#include <cstdio>
#include <iostream>
#include <string>

int main()
{
	double i, posSnail;
	int H, U, D, F;
	string r1;

	cin >> H >> U >> D >> F;
	while(H!=0 && U!=0 && D!=0 && F!=0)
	{
		i=1; posSnail=0;
		while(true)
		{
			double subida=(U-(U*(i-1)*F/100));
			posSnail+=(subida>=0)?subida:0;
			if(posSnail>H)break;
			posSnail-=D;
			if(posSnail<0)break;
			i++;
		}

		r1=(posSnail<0)?"failure":"success";
		cout << r1 << " on day " << (int)i << endl;

		cin >> H >> U >> D >> F;
	}

	return 0;
}
