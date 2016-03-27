using namespace std;
#include <cstdio>
#include <string>
#include <sstream>

bool test=true;

string parseInt(int number)
{
  stringstream ss;
  ss << number;
  return ss.str();
}

int main()
{
	if(test) freopen("in.txt","r",stdin);

	string s;
	int num;
	scanf("%d", &num);
	while(num)
	{
		s = parseInt(num);
		while(s.length()>1)
		{
			int f=0;
			for(int i=0; i<s.length(); i++) f+=(s[i]-'0');
			s=parseInt(f);
		}
		printf("%c\n", s[0]);
		scanf("%d", &num);
	}
	return 0;
}
