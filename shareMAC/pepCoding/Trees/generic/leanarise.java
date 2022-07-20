import java.util.*;
class leanarise
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
	static Node getTail(Node node)
	{
		if (node.children.size() == 0)
		{
			Node temp = node;
			return temp;
		}
		Node temp = getTail(node.children.get(0));
		return temp;
	}
	static void leanarise(Node head)
	{
		for (int i = 0; i < head.children.size(); i++)
		{
			leanarise(head.children.get(i));
		}
		while (head.children.size() > 1)
		{
			int len = head.children.size();
			Node last = head.children.remove(len - 1);
			Node secondLast = head.children.get(len - 2);
			Node secondLastTail = getTail(secondLast);
			secondLastTail.children.add(last);
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
		System.out.println("Lenearised Tree-->");
		leanarise(root);
		display(root);
	}
}