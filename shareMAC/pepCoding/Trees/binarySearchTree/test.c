#include <stdio.h>
struct node
{
	int data;
	struct node *left;
	struct node *right;
};
struct node *head=NULL;
int main()
{
	int a[] = {10, 20, 40, 50, 60, 70, 90, 100};
	int n=sizeof(a)/sizeof(a[0]);
	// struct node  *ptr = NULL;
	head=construct(a, 0,n);
}

struct node *construct(int a[], int l, int h)
{
	if (l > h)
	{
		return NULL;
	}
	int mid = (l + h) / 2;
	int data = a[mid];
	struct node * lc = construct(a, l, mid - 1);
	struct node *rc = construct(a, mid + 1, h);
	head->data = data;
	head->left = lc;
	head->right = rc;
	return head; 
}