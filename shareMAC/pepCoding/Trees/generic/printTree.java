import java.util.*;
class printTree
{
	private static class Node
	{
		int data;		//stores the data
		ArrayList<Node> children = new ArrayList<>();		//stores the address of the next node
	}
	public static void display(Node node)
	{
		if (node.children.size() == 0)
		{
			return;
		}
		System.out.print(node.data + " --> ");
		for (int i = 0; i < node.children.size(); i++)
		{
			System.out.print(node.children.get(i).data + ", ");
		}
		System.out.println();
		for (int i = 0; i < node.children.size(); i++)
		{
			display(node.children.get(i));
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
		Stack<Node> st = new Stack<>();
		Node head = new Node();
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
					head = temp;
					st.push(head);
				}
			}
		}
		display(head);
	}
}