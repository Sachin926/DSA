import java.util.*;
class Celebrity
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				arr[i][j] = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++)
			st.push(i);
		while (st.size() >= 2)
		{
			int b = st.pop();
			int a = st.pop();
			if (arr[a][b] == 1)
			{
				st.push(b);
			}
			else
			{
				st.push(a);
			}
		}
		for (int i = 0; i < n; i++)
		{
			if (i != st.peek())
			{
				if (arr[st.peek()][i] == 1 || arr[i][st.peek()] == 0)
				{
					System.out.println("None");
					return;
				}
			}
		}
		System.out.println(st.peek());
	}
}