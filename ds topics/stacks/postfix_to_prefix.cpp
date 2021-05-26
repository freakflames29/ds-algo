//post fix to prefix convert
// #include<sourav.h>
#include<iostream>
using namespace std;
#include<stack>
bool isOp(char c)
{
    return ((c>='a'&&c<='z')||(c>='A'&&c<='Z'));
    
  
}
string post_To_pre(string s)
{
    stack<string> st;
    for (int i = 0; i < s.length(); i++)
    {
        if(isOp(s[i]))
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
            string ops(1,s[i]);
            string res=ops+op2+op1;
            st.push(res);
        }
    }
    return st.top();
    
}
int main()
{
    string s="abc/-ak/l-*";
    cout<<post_To_pre(s)<<endl;
    return 0;
}