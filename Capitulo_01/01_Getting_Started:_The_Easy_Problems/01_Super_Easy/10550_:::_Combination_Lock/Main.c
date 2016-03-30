#include "stdio.h"

int main()
{
	int p0, p1, p2, p3, ang1, ang2, ang3, ans, i;

	while(scanf("%d %d %d %d",&p0,&p1,&p2,&p3),(p0||p1||p2||p3))
	{
		ans=1080;
		ang1=0,ang2=0,ang3=0;
		for(i=p1; i!=p0; i=(i+1)%40) ang1++;
		for(i=p2; i!=p1; i=(i+39)%40) ang2++;
		for(i=p3; i!=p2; i=(i+1)%40) ang3++;

		/* Solucion O(1)
		ans = 1080;
		ans += (init - c1) > 0 ? (init - c1) * 9 : (init - c1 + 40) * 9;
		ans += (c2 - c1) > 0 ? (c2 - c1) * 9 : (c2 - c1 + 40) * 9;
		ans += (c2 - c3) > 0 ? (c2 - c3) * 9 : (c2 - c3 + 40) * 9;
		*/

		ans+=((ang1+ang2+ang3)*9);

		printf("%d\n",ans);
	}

	return 0;
}
