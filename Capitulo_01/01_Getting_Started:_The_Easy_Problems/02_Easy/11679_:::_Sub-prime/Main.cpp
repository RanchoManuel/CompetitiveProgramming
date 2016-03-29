using namespace std;
#include <cstdio>

bool test=true;

int main()
{
	if(test) freopen("in.txt","r",stdin);
	
	int B, N, R[20+2], D, C, V;
	bool rta;
	while(scanf("%d %d", &B, &N), (B||N))
	{
		for(int i=0; i<B; i++) scanf("%d", &R[i]);
		
		rta=true;
		while(N--)
		{
			scanf("%d %d %d", &D, &C, &V);
			D--; C--;
			
			R[C]+=V;
			R[D]-=V;
		}
		
		for(int i=0; i<B; i++)
		{
			if(R[i]<0)
			{
				rta=false;
				break;
			}
		}
		puts(rta?"S":"N");			
	}
	
	return 0;
}
