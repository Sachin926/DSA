import java.util.*;
class kLargest
{
	private static class Node
	{
		int data;
		ArrayList<Node> children = new ArrayList<>();
		Node()
		{
			//default constructor
		}
		Node(int data)
		{
			this.data = data;
		}
	}
	static void display(Node head)
	{
		if (head.children.size() == 0)
		{
			return;
		}
		System.out.print(head.data + "--> ");
		for (int i = 0; i < head.children.size(); i++)
		{
			System.out.print(head.children.get(i).data + ", ");
		}
		System.out.println();
		for (int i = 0; i < head.children.size(); i++)
		{
			display(head.children.get(i));
		} 
	}
	static int ceil;
	static int floor;
	public static void getCeilAndFloor(Node head, int n)
	{
		if (head.data < n)
		{
			if (head.data > floor)
				floor = head.data;
		}
		else if(head.data > n)
		{
			if (head.data < ceil)
				ceil = head.data;
		}
		for (int i = 0; i < head.children.size(); i++)
			getCeilAndFloor(head.children.get(i), n);
	}
	public static int kthLargest(Node head, int k)
	{
		int val = Integer.MAX_VALUE;
		for (int i = 1; i <= k; i++)
		{
			getCeilAndFloor(head, val);
			val = floor;
			floor = Integer.MIN_VALUE;
		}
		return val;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {10, 20, 50, -1, 60, -1, -1, 30,
			 			70, -1, 80, 110, -1, 120, -1, -1,
		  					90, -1, -1, 40, 100, -1, -1, -1};
		Stack<Node> st = new Stack<>();
		Node root = new Node();
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == -1)
			{
				st.pop();
			}
			else
			{
				Node temp = new Node();
				temp.data = arr[i];
				if (st.size() > 0)
				{
					st.peek().children.add(temp);
					st.push(temp);
				}
				else
				{
					root = temp;
					st.push(root);
				}
			}
		}
		display(root);	
		floor = Integer.MIN_VALUE;
		ceil = Integer.MAX_VALUE;
		System.out.println(kthLargest(root, 3));
	}
}