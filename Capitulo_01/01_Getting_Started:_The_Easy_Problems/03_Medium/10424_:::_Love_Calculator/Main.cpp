using namespace std;
#include <cstdio>
#include <iostream>
#include <string>
#include <sstream>
#include <algorithm>

string parseInt(int number)
{
  stringstream ss;
  ss << number;
  return ss.str();
}

int main()
{
	string s1, s2;
	int sum1, sum2, i;
	double rta;

	while(getline(cin, s1))
	{
		getline(cin, s2);

		sum1=sum2=0;
		for(i=0; i<s1.length(); i++)
		{
			if(isalpha(s1[i]))
			{
				s1[i]=tolower(s1[i]);
				sum1+=(s1[i]-'a'+1);
			}
		}

		for(i=0; i<s2.length(); i++)
		{
			if(isalpha(s2[i]))
			{
				s2[i]=tolower(s2[i]);
				sum2+=(s2[i]-'a'+1);
			}
		}

		s1=parseInt(sum1);
		while(s1.length()!=1)
		{
			sum1=0;
			for(i=0; i<s1.length(); i++) sum1+=(s1[i]-'0');
			s1=parseInt(sum1);
		}

		s2=parseInt(sum2);
		while(s2.length()!=1)
		{
			sum2=0;
			for(i=0; i<s2.length(); i++) sum2+=(s2[i]-'0');
			s2=parseInt(sum2);
		}

		rta=(double)min(sum1, sum2)*100.0/(double)max(sum1, sum2);
		printf("%.2f %\n", rta);
	}

	return 0;
}
