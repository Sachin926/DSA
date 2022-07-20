import java.util.*;
class nodeToRootPath
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
	public static ArrayList<Integer> nodeToRootPath(Node root, int n) {
    // write your code here
    ArrayList<Integer> res = new ArrayList<>();
    if (root == null) {
        return res;
    }
    if (root.data == n) {
        res.add(n);
        return res;
    }
    res = nodeToRootPath(root.left, n);
    if (res.size() > 0) {
        res.add(root.data);
        return res;
    }
    else {
        res.clear();
        res = nodeToRootPath(root.right, n);
        if (res.size() > 0) {
        	res.add(root.data);
        	return res;
    	}
    }
    return res;
  }
	public static ArrayList<Integer> getPath(Node head, int n)
	{
		ArrayList<Integer> res = new ArrayList<>();
		if (head.data == n)
		{
			res.add(n);
			return res;
		}
		if (head.left != null)
		{
			res = getPath(head.left, n);
			if (res.size() > 0)
			{
				res.add(head.data);
				return res;
			}
		}
		if(head.right != null)
		{
			res = getPath(head.right, n);
			if(res.size() > 0)
			{
				res.add(head.data);
				return res;
			}
		}
		return res;
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
		System.out.println(nodeToRootPath(root, 30));
	}
}