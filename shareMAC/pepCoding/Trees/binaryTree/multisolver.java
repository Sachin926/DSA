import java.util.*;
class multisolver
{
	private static class Node
	{
		Node left, right;
		Integer data;
		Node (int data, Node left, Node right)
		{
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	private static class Pair
	{
		Node node;
		int state;
		Pair(Node node, int state)
		{
			this.node = node;
			this.state = state;
		}
	}
	static void displayTree(Node head)
	{
		if(head == null)
			return;
		String str = "";
		str += head.left == null ? ".<-" : head.left.data + "<-";
		str += head == null ? ".->" : head.data + "->";
		str += head.right == null ? "." : head.right.data + "";
		System.out.println(str);
		displayTree(head.left);
		displayTree(head.right);
	}
	public static int getTreeSum(Node head)
	{
		if (head == null)
			return 0;
		int sum = 0;
		sum = sum + getTreeSum(head.left);
		sum = sum + getTreeSum(head.right);
		sum = sum + head.data;
		return sum;
	}
	public static int getTreeHeight(Node head)
	{
		if (head == null)
			return 0;
		int h1=getTreeHeight(head.left);
		int h2 = getTreeHeight(head.right);
		int height = h1 > h2 ? h1 + 1 : h2 + 1;
		return height;
	}
	public static int getTreeSize(Node head)
	{
		if (head == null)
			return 0;
		int s = getTreeSize(head.left);
		s = s + getTreeSize(head.right);
		s= s + 1;
		return s;
	}
	public static int getTreeMax(Node head)
	{
		if (head == null)
			return 0;
		int max1 = getTreeMax(head.left);
		int max2 = getTreeMax(head.right);
		int max = max1 > max2 ? max1 : max2;
		return max > head.data ? max : head.data;
	}
	public static void main(String[] args)
	{
		Integer a[] = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
		Node root = new Node(a[0], null, null);
		Pair rp = new Pair(root, 1);
		Stack<Pair> st = new Stack<>();
		st.push(rp);
		int idx = 0;
		while(st.size() > 0)
		{
			Pair top = st.peek();
			if (top.state == 1)
			{
				idx++;
				if(a[idx] != null)
				{
					top.node.left = new Node(a[idx], null, null);
					Pair lp = new Pair(top.node.left, 1);
					st.push(lp);
				}
				else
				{
					top.node.left = null;
				}
				top.state++;
			}
			else if (top.state == 2)
			{
				idx++;
				if(a[idx] != null)
				{
					top.node.right = new Node(a[idx], null, null);
					Pair lp = new Pair(top.node.right, 1);
					st.push(lp);
				}
				else
				{
					top.node.right = null;
				}
				top.state++;
			}
			else
			{
				st.pop();
			}
		}
		displayTree(root);
		System.out.println("Sum = " + getTreeSum(root));
		System.out.println("Height = " + getTreeHeight(root));
		System.out.println("Size = " + getTreeSize(root));
		System.out.println("Maximum = " + getTreeMax(root));
	}
}