// zigzag trav for tree
             
//           --->
//           12
//         /	\
	<------------
//        9	 15
//       / \
     ------------>
//     4    10

// output :- 12 15 9 4 10

#include <sourav.h>
#include <stack>
class Node
{
public:
	int data;
	Node *right,*left;
	Node(int data)
	{
		this->data=data;
		right=left=NULL;
	}
};
void zigzagtrav(Node *root)
{
	stack<Node*> curr;
	stack<Node*> next;
	bool leftToright=true;
	curr.push(root);
	while(!curr.empty())
	{
		Node *tmp=curr.top();
		curr.pop();
		if(tmp)
		{
			cout<<tmp->data<<" ";
			if(leftToright)
			{
				next.push(tmp->left);
				next.push(tmp->right);
			}
			else
			{
				next.push(tmp->right);
				next.push(tmp->left);
			}
		}
		if(curr.empty())
		{
			leftToright=!leftToright;
			swap(curr,next);
		}
	}
}
int main()
{	
	#ifndef ONLINE_JUDGE
		freopen("../input.txt", "r", stdin);
		freopen("../output.txt", "w", stdout);
	#endif
	Node *root=new Node(12);
	root->right=new Node(15);
	root->left=new Node(9);
	root->left->left=new Node(4);
	root->left->right=new Node(10);
	zigzagtrav(root);
	return 0;
}
