#include "stdio.h"
#include "string.h"

int main()
{
	int casos, num;
	char buffer[100];

	scanf("%d",&casos);
	while(casos--)
	{
		scanf("%d",&num);
		num=((((num*63)+7492)*5)-498);

		sprintf(buffer, "%d", num);
		printf("%c\n",buffer[strlen(buffer)-2]);
	}

	return 0;
}
