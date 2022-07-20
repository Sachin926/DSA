import java.util.*;
class kLevelsFar
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
	public static boolean isNode(Node head, int n)
	{
		if (head.data == n)
			return true;
		if (head.left != null)
		{
			if (isNode(head.left, n) == true)
				return true;
		}
		if (head.right != null)
		{
			if (isNode(head.right, n) == true)
				return true;
		}
		return false;
	}
	public static void printKlevelsFar(Node head, int data, int k)
	{
		ArrayList<Node> path = nodeToRootPath(head, data);
		for (int i = 0; i < path.size(); i++)
		{
			printKlevelsDown(path.get(i), k - i, i == 0 ? null : path.get(i - 1));
		}
	}
	public static void printKlevelsDown(Node head, int k, Node blocker)
	{
		if (head == null || k < 0 || head == blocker)
		{
			return;
		}
		if (k == 0)
		{
			System.out.println(head.data);
		}
		printKlevelsDown(head.left, k - 1, blocker);
		printKlevelsDown(head.right, k - 1, blocker);
	}
	public static ArrayList<Node> nodeToRootPath(Node head, int n)
	{
		ArrayList<Node> res = new ArrayList<>();
		if (head == null)
			return res;
		if (head.data == n)
		{
			res.add(head);
			return res;
		}
		res = nodeToRootPath(head.left, n);
		if (res.size() > 0)
		{
			res.add(head);
			return res;
		}
		res = nodeToRootPath(head.right, n);
		if (res.size() > 0)
		{
			res.add(head);
			return res;
		}
		return res;
	}
	public static void main(String[] args)
	{
		Integer a[] = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null,
		 70, null, null, 87, null, null};
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
		ArrayList<Node> temp = nodeToRootPath(root, 62);
		for(int i = 0; i < temp.size(); i++)
			System.out.print(temp.get(i).data + ", ");
	}
}