import java.util.*;
class stockSpan
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		st.push(0);
		System.out.println(1);
		for (int i = 1; i < n; i++)
		{
			while(a[i] > a[st.peek()])
			{
				st.pop();
				if (st.size() == 0)
				{
					System.out.println(i + 1);
					break;
				}
			}
			if (st.size() > 0)
			{
				System.out.println(i - st.peek());
			}
			st.push(i);
		}
	}
}