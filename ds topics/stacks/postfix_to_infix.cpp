//post fix to infix convert
#include <iostream>
#include <stack>
using namespace std;
bool isOperand(char c)
{
	return ((c>='a'&&c<='z') || (c>='A'&&c<='Z'));
}
string infix(string s)
{
	stack<string> st;
	for(int i=0;i<s.length();i++)
	{
		if(isOperand(s[i]))
		{
			string ops(1,s[i]);
			st.push(ops);
		}
		else
		{
			string op1=st.top();
			st.pop();
			string op2=st.top();
			st.pop();
			string res(1,s[i]);
			string fin="("+op2+res+op1+")";
			st.push(fin);
		}
	}
	return st.top();
}
int main()
{
	string s="abc/-ak/l-*";
	string res=infix(s);
	res[0]='\0';
	res[res.length()-1]='\0';
	
	cout<<res<<endl;
	return 0;
}	