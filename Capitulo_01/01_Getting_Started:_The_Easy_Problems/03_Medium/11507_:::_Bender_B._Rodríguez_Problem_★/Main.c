#include "stdio.h"
#include "string.h"

int map [6][6]={{-1,-1,2,3,4,5},
				{-1,-1,3,2,5,4},
				{-1,-1,1,0,2,2},
				{-1,-1,0,1,3,3},
				{-1,-1,4,4,1,0},
				{-1,-1,5,5,0,1}};

int mapeado(char* instr)
{
	if(strcmp(instr, "+x")==0) return 0;
	else if(strcmp(instr, "-x")==0) return 1;
	else if(strcmp(instr, "+y")==0) return 2;
	else if(strcmp(instr, "-y")==0) return 3;
	else if(strcmp(instr, "+z")==0) return 4;
	else return 5;
}

void darRepuesta(int pos)
{
	if(pos==0) puts("+x");
	else if(pos==1) puts("-x");
	else if(pos==2) puts("+y");
	else if(pos==3) puts("-y");
	else if(pos==4) puts("+z");
	else if(pos==5) puts("-z");
}

int main()
{
	int numInst, pos, i;
	char instr[10];
	
	while(scanf("%d", &numInst),(numInst!=0))
	{
		pos=0;
		for(i=0; i<numInst-1; i++)
		{
			scanf("%s", instr);
			if(strcmp(instr, "No")!=0) pos=map[pos][mapeado(instr)];
		}
		darRepuesta(pos);
	}
	return 0;
}
