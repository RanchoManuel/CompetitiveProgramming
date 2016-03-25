using namespace std;
#include <cstdio>
#include <sstream>      // std::stringstream

bool test=true;

int main()
{
	if(test) freopen("in.txt","r",stdin);

	int casos, num;
	stringstream s;
	string temp;

	scanf("%d",&casos);
	while(casos--)
	{
		scanf("%d",&num);
		num=((((num*63)+7492)*5)-498);

		s << num;
		temp=s.str();
		printf("%c\n",temp[temp.length()-2]);
	}

	return 0;
}
