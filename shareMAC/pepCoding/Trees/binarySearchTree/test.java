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
		int t = sc.nextInt();
		while (t > 0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			int k = sc.nextInt();
			Node root = construct(a, 0, a.length - 1);
			path = "";
			sum = 0;
			traverse(root, k);
			System.out.println("Sum of the path=" + sum);
			System.out.println("Path=" + path);
			t--;
		}
	}
	static String path;
	static int sum;
	public static void traverse(Node head, int k)
	{
		if (head.left == null && head.right == null)
		{
			sum = sum + head.data;
			path = path + head.data;
			return;
		}
		if (Math.abs(head.data - k) % 2 == 0)
		{
			if (head.left != null)
			{
				sum = sum + head.data;
				path = path + head.data + " -> ";
				traverse(head.left, k);
			}
		}
		else if (Math.abs(head.data - k) % 2 != 0)
		{
			if (head.right != null)
			{
				sum = sum + head.data;
				path = path + head.data + " -> ";
				traverse(head.right, k);
			}
		}
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