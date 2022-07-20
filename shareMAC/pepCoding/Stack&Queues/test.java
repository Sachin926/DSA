import java.util.*;
class test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		Stack<Integer> st = new Stack<>();
		int n = 1;
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if (ch == 'd')
			{
				st.push(n);
				n++;
			}
			else
			{
				st.push(n);
				n++;
				while (st.size() != 0)
				{
					System.out.print(st.pop());
				}
			}
		}
		st.push(n);
		while(st.size() != 0)
		{
			System.out.print(st.pop());
		}
	}
}