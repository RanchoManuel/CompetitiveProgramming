#include "stdio.h"
#include "string.h"

int main()
{
	char comando[7];
	int casos, total=0, estaDonacion;
	scanf("%d", &casos);
	while(casos--)
	{
		scanf("%s", comando);
		if(strcmp(comando,"donate")==0)
		{
			scanf("%d", &estaDonacion);
			total+=estaDonacion;
		}
		else printf("%d\n", total);
	}

	return 0;
}
