import java.util.*;
class nextGreaterElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		System.out.println("Next Greater Element = " + "-1");
		st.push(a[n - 1]);
		for (int i = n - 2; i >= 0; i--)
		{
			while(a[i] > st.peek())
			{
				st.pop();
				if (st.size() == 0)
				{
					System.out.println("Next Greater Element = " + "-1");
					break;
				}
			}
			if (st.size() > 0)
			{
				System.out.println("Next Greater Element = " + st.peek());
			}
			st.push(a[i]);
		}
	}
}