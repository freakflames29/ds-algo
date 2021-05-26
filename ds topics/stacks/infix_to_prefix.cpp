#include <iostream>
#include <stack>
using namespace std;
int prec(char c) //checking the order of an operator
{
	if(c=='^')
	{
		return 3;
	}
	else if(c=='*'||c=='/')
	{
		return 2;
	}
	else if(c=='+'||c=='-')
	{
		return 1;
	}
	else 
	{
		return -1;
	}
}
string intopre(string s)
{
	stack<char> st;
	string res="";
	for(int i=0;i<s.length();i++)
	{
		if((s[i]>='a' && s[i]<='z') ||( s[i]>='A' && s[i]<='Z'))
		{
			res+=s[i];
		}
		else if(s[i]==')')
		{
			st.push(s[i]);
		}
		else if(s[i]=='(')
		{
			while(!st.empty()&&st.top()!=')')
			{
				res+=st.top();
				st.pop();
			}
			if(!st.empty())
			{
				st.pop();
			}
		}
		else
		{
			while(!st.empty()&& prec(st.top())>=prec(s[i]))
			{
				res+=st.top();
				st.pop();
			}
			st.push(s[i]);
		}
	}
	while(!st.empty())
	{
		res+=st.top();
		st.pop();
	}
	return res;
}
int main()
{
	// (a-b/c)*(a/k-l)
	string a="(a-b/c)*(a/k-l)";
	string b="";
	for(int i=a.length()-1;i>=0;i--) //reversing the string 
	{
		b+=a[i];
	}
	// b[0]='(';
	// b[b.length()-1]=')';
	string tmp=intopre(b);
	// cout<<b<<endl;
	string x="";
	for(int j=tmp.length()-1;j>=0;j--)
	{
		x+=tmp[j];
	}
	cout<<x<<endl;
}