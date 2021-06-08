// cpp program to print min number from a stack
// in O(1) or constant time

#include <iostream>
#include <stack>
#include <limits.h>
using namespace std;
class st
{
public:
	stack<int> s2;
	void push(stack<int> &s1,int value)
	{
		if(value<=min())
		{
			s2.push(value);
		}
		s1.push(value);
	}
	void pop(stack<int> &s1)
	{
		int tmp=s1.top();
		s1.pop();
		if(tmp==min())
		{
			s2.pop();
		}
	}
	int min()
	{
		if(s2.empty())
		{
			return INT_MAX;
		}
		else
		{
			return s2.top();
		}
	}
	void trav(stack<int> &s1)
	{
		while(s1.empty()==false)
		{
			cout<<s1.top()<<endl;
			s1.pop();
		}
	}
};
int main()
{
	#ifndef ONLINE_JUDGE
		freopen("../input.txt", "r", stdin);
		freopen("../output.txt", "w", stdout);
	#endif
	st *ob=new st();
	stack<int> s1;
	int j;
	for(int i=0;i<5;i++)
	{
		cin>>j;
		ob->push(s1,j);

	}
	ob->pop(s1);
	
	cout<<ob->min();
}