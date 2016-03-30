#include "stdio.h"

int main()
{
	int meses, numIntereses, mesInteres, anteriorMes, t=0, i;
	double down, deuda, pago, precioCarro, interes, anteriorInteres;
	double depreciacionPeriodo[101+10];//Los de seguridad por OutOfBounds

	scanf("%d %lf %lf %d", &meses, &down, &deuda, &numIntereses);
	while(meses>=0)
	{
		precioCarro=deuda+down;
		pago=deuda/meses;
		numIntereses--;

		//Primer dato
		scanf("%d %lf", &mesInteres, &interes);
		precioCarro=precioCarro*(1-interes);
		depreciacionPeriodo[0]=interes;//No lo uso, esa por claridad

		//Agarro la informacion de la depreciacion de cada periodo
		for(anteriorInteres=interes, anteriorMes=0; numIntereses--!=0; anteriorInteres=interes, anteriorMes=mesInteres)
		{
			scanf("%d %lf", &mesInteres, &interes);
			for(i=mesInteres-1; i>=anteriorMes; i--) depreciacionPeriodo[i]=anteriorInteres;
		}
		for(i=meses; i>=anteriorMes; i--) depreciacionPeriodo[i]=anteriorInteres;

		//Inicio la simulacion
		for(t=0; t<=meses; t++)
		{
			if(t>0)
			{
				deuda-=pago;
				precioCarro=precioCarro*(1-depreciacionPeriodo[t]);
			}
			if(deuda<precioCarro) break;
		}

		//Escribo respuesta
		if(t==1) printf("%d month\n", t);
		else printf("%d months\n", t);

		scanf("%d %lf %lf %d", &meses, &down, &deuda, &numIntereses);
	}
	
	return 0;
}
