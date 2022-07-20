import java.util.*;
class lineWise
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
	static void linewiseLevelOrder(Node head)
	{
		Queue<Node> q = new ArrayDeque<>();
		Queue<Node> child = new  ArrayDeque<>();
		q.add(head);
		while (q.size() > 0 || child.size() > 0)
		{
			Node temp = q.remove();
			System.out.print(temp.data + ", ");
			for (int i = 0; i < temp.children.size(); i++)
			{
				child.add(temp.children.get(i));
			}
			if (q.size() == 0)
			{
				System.out.println();
				q = child;
				child = new ArrayDeque<>();
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
		linewiseLevelOrder(root);
	}
}