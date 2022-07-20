import java.util.*;
class test
{
	static class Node
	{
		int data;
		Node left, right;
		Node (int data, Node left, Node right)
		{
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Node root = construct(a, 0, a.length - 1);
		displayTree(root);
	}
	public static void displayTree(Node head)
	{
		if (head == null)
		{
			return;
		}
		if (head.left != null && head.right != null)
			System.out.println(head.left.data + "<-" + head.data + "->" + head.right.data);
		else if(head.left == null && head.right != null)
			System.out.println(".<-" + head.data + "->" + head.right.data);
		else if(head.left != null && head.right == null)
			System.out.println(head.left.data + "<-" + head.data + "->.");
		else
			System.out.println(".<-" + head.data + "->.");

		displayTree(head.left);
		displayTree(head.right);
	}
	public static Node construct(int a[], int lo, int hi)
	{
		if (lo > hi)
		{
			return null;
		}
		int mid = (lo + hi) / 2;
		int data = a[mid];
		Node lc = construct(a, lo, mid - 1);
		Node rc = construct(a, mid + 1, hi);
		Node node = new Node(data, lc, rc);
		return node;
	}
}