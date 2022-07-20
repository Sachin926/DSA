import java.util.*;
class isSymmetric
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
	public static boolean areMirror(Node n1, Node n2) {
    // write your code here
    if (n1.children.size() == n2.children.size())
    {
        for(int i = 0, j = n2.children.size() - 1; i < n1.children.size(); i++, j--)
        {
            if (n1.children.get(i).children.size() != n2.children.get(j).children.size())
            {
                return false;
            }
        }
        for (int i = 0, j = n2.children.size() - 1; i < n1.children.size(); i++, j--)
        {
            if (areMirror(n1.children.get(i), n2.children.get(j)) == false)
            return false;
        }
    }
    else
    return false;
    return true;
  }
  public static boolean isSymmetric(Node head)
  {
  	if (areMirror(head, head) == true)
  		return true;
  	else
  		return false;
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
		System.out.println("Is Symmetric-->");
		System.out.println(isSymmetric(root));
	}
}
