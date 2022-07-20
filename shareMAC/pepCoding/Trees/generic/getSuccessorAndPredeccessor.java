import java.util.*;
class getSuccessorAndPredeccessor
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
	static Node predecessor;
	static Node successor;
	static int k;
	public static void getSuccessorAndPredecessor(Node head, int n)
	{
		if (k == 0)
		{
			if (head.data == n)
				k = 1;
			else
				predecessor = head;
		}
		else if (k == 1)
		{
			k = 2;
			successor = head;
		}
		for (int i = 0; i < head.children.size(); i++)
		{
			getSuccessorAndPredecessor(head.children.get(i), n);
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
		successor = root;
		predecessor = root;	
		System.out.println("Successor and Predecessor-->");
		getSuccessorAndPredecessor(root, 90);
		System.out.println("Successor = " + successor.data);
		System.out.println("Predecessor = " + predecessor.data);
	}
}