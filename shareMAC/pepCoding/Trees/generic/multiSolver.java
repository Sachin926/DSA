import java.util.*;
class multiSolver
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
	static int max;
	static int min;
	static int height;
	static int size = 0;
	public static void multiSolver(Node head, int depth)
	{
		size++;
		if (head.data < min)
			min = head.data;
		if (head.data > max)
			max = head.data;
		if (height < depth)
			height = depth;
		for (int i = 0; i < head.children.size(); i++)
		{
			multiSolver(head.children.get(i), depth + 1);
		}
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
		System.out.println("Minimun data-->");
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		height = 0;
		multiSolver(root, 1);
		System.out.println("MAX = " + max);
		System.out.println("MIN = " + min);
		System.out.println("Size = " + size);
		System.out.println("Height = " + height);
	}
}