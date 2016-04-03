using namespace std;
#include <cstdio>
#include <iostream>
#include <string>

int map [6][6]={{-1,-1,2,3,4,5},
				{-1,-1,3,2,5,4},
				{-1,-1,1,0,2,2},
				{-1,-1,0,1,3,3},
				{-1,-1,4,4,1,0},
				{-1,-1,5,5,0,1}};

int mapeado(string instr)
{
	if(instr=="+x") return 0;
	else if(instr=="-x") return 1;
	else if(instr=="+y" )return 2;
	else if(instr=="-y") return 3;
	else if(instr=="+z") return 4;
	else return 5;
}

void darRepuesta(int pos)
{
	if(pos==0) cout << "+x";
	else if(pos==1) cout << "-x";
	else if(pos==2) cout << "+y";
	else if(pos==3) cout << "-y";
	else if(pos==4) cout << "+z";
	else if(pos==5) cout << "-z";
	cout << endl;
}

int main()
{
	int numInst; cin >> numInst;
	while(numInst!=0)
	{
		int pos=0;
		string instr;
		for(int i=0;i<numInst-1;i++)
		{
			cin >> instr;
			if(instr!="No") pos=map[pos][mapeado(instr)];
		}
		darRepuesta(pos);
		cin >> numInst;
	}
	return 0;
}
