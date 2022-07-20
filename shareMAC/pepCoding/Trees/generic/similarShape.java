import java.util.*;
class similarShape
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
	public static ArrayList<Integer> getPath(Node head, int n)
	{	
		ArrayList<Integer> res = new ArrayList<>();
		if (head.data == n)
		{
			res.add(n);
			return res;
		}
		for (int i = 0; i < head.children.size(); i++)
		{
			res = getPath(head.children.get(i), n);
			if (res.size() > 0)
			{
				res.add(head.data);
				return res;
			}
		}
		return res;
	}
	public static boolean checkShape(Node head1, Node head2)
	{
		boolean flag = true;
		if (head1.children.size() == head2.children.size())
		{
			for (int i = 0; i < head1.children.size(); i++)
			{
				if (checkShape(head1.children.get(i), head2.children.get(i)) == true)
					continue;
				else
				{
					flag = false;
					break;
				}
			}
		}
		else
			return false;
		return flag;
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
		System.out.println("isSimilar-->");
		System.out.println(checkShape(root, root));
	}
}