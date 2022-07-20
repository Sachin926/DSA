import java.util.*;
class lineTraversalMethod2
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
	static void lineTraversal(Node head)
	{
		Queue<Node> q = new ArrayDeque<>();
		q.add(head);
		q.add(new Node(-1));
		while (q.size() > 0)
		{
			Node temp = q.remove();
			if (temp.data == -1)
			{
				if (q.size() > 0)
				{
					q.add(new Node(-1));
					System.out.println();
				}
			}
			else
			{
				System.out.print(temp.data + ", ");
				for (int i = 0; i < temp.children.size(); i++)
				{
					q.add(temp.children.get(i));
				}
		}	}
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
		System.out.println("Level Order Traversal-->");
		lineTraversal(root);
	}
}