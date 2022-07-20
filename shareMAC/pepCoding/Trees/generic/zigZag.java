import java.util.*;
class zigZag
{
	private static class Node
	{
		int data;
		ArrayList<Node> children = new ArrayList<>();
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
	static void zigzagTraversal(Node head)
	{
		Stack<Node> ms = new Stack<>();
		Stack<Node> cs = new Stack<>();
		ms.add(head);
		int level = 1;
		while (ms.size() > 0 || cs.size() > 0)
		{
			Node temp = ms.pop();
			System.out.print(temp.data + ", ");
			if (level % 2 != 0)
			{
				for (int i = 0; i < temp.children.size(); i++)
				{
					cs.push(temp.children.get(i));
				}
			}
			else
			{
				for (int i = temp.children.size() - 1; i >= 0; i--)
				{
					cs.push(temp.children.get(i));
				}
			}
			if (ms.size() == 0)
			{
				ms = cs;
				cs = new Stack<>();
				level++;
				System.out.println();
			}
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
		System.out.println("Level Order Traversal-->");
		zigzagTraversal(root);
	}
}