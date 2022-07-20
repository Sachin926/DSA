import java.util.*;
class test
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
	static class Order {
		Node node;
		int level;
		Order(Node node, int level) {
			this.node = node;
			this.level = level;
		}
	}
	static void getVertical(Node root) {
		HashMap<Integer, ArrayList<Node>> map = new HashMap<>();
		Queue<Order> q = new ArrayDeque<>();
		int min = 0;
		int max = 0;
		q.add(new Order(root, 0));
		while (q.size() > 0) {
			int k = q.size();
			while (k > 0) {
				Order temp = q.remove();
				if (map.containsKey(temp.level)) {
					ArrayList<Node> t = map.get(temp.level);
					t.add(temp.node);
					map.put(temp.level, t);
				}
				else {
					ArrayList<Node> t = new ArrayList<>();
					t.add(temp.node);
					map.put(temp.level, t);
				}
				if (temp.node.left != null) {
					q.add(new Order(temp.node.left, temp.level - 1));
					min = Math.min(min, temp.level - 1);
				}
				if (temp.node.right != null) {
					q.add(new Order(temp.node.right, temp.level + 1));
					max = Math.max(max, temp.level + 1);
				}
				k--;
			}
		}
		for (int i = min; i <= max; i++) {
			displayNode(map.get(i));
		}
	}
	static void displayNode(ArrayList<Node> res) {
		for (int i = 0; i < res.size(); i++) {
			System.out.print(res.get(i).data + " ");
		}
		System.out.println();
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
		getVertical(root);
	}
}