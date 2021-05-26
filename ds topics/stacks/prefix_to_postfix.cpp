//prefix to postfix
#include<sourav.h>
#include<stack>
#include<algorithm>
bool isOp(char c)
{
    return ((c>='a'&&c<='z')||(c>='A'&&c<='Z'));
}
string pre_to_po(string s)
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
    // *-a/bc-/akl
    string s="*-a/bc-/akl";
    reverse(s.begin(),s.end());
    string res=pre_to_po(s);
    reverse(res.begin(),res.end());
    cout<<res<<endl;
    return 0;
}