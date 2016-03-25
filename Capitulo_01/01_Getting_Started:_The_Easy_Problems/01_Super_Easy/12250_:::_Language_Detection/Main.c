#include "stdio.h"
#include "string.h"

int test=1;

int main()
{
	if(test) freopen("in.txt","r",stdin);

	char s[20]; //14 + seguridad
	fgets(s, sizeof(s), stdin);

	int c;
	for(c=1; strcmp(s,"#")!=0; fgets(s, sizeof(s), stdin))
	{
		s[strlen(s)-1]='\0'; //fgets captures the enter
		
		printf("Case %d: ", c++);
		if(strcmp(s,"HELLO")==0) printf("ENGLISH\n");
		else if(strcmp(s,"HOLA")==0) printf("SPANISH\n");
		else if(strcmp(s,"HALLO")==0) printf("GERMAN\n");
		else if(strcmp(s,"BONJOUR")==0) printf("FRENCH\n");
		else if(strcmp(s,"CIAO")==0) printf("ITALIAN\n");
		else if(strcmp(s,"ZDRAVSTVUJTE")==0) printf("RUSSIAN\n");
		else printf("UNKNOWN\n");
	}

	return 0;
}
