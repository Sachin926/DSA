import java.util.*;
class distanceBetweenNodes
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
	public static int distance(Node head, int a, int b)
	{
		ArrayList<Integer> pathA = getPath(head, a);
		ArrayList<Integer> pathB = getPath(head, b);
		int i, j;
		for (i = pathA.size() - 1, j = pathB.size() - 1; i >=0; i--, j--)
		{
			if (pathA.get(i) != pathB.get(j))
				break;
		}
		i = i + 1;
		j = j + 1;
		return i + j;
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
		System.out.println("Distance Between Nodes-->");
		System.out.println(distance(root, 50, 100));
	}
}
