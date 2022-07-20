import java.util.*;
class duplicateBrackets
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		Stack<Character> st = new Stack<>();
		boolean flag = true;
		for (int i = 0; i < s.length(); i++)
		{
			st.push(s.charAt(i));
			if (s.charAt(i) == ')')
			{
				st.pop();
				if (st.peek() == '(')
				{
					flag = false;
					break;
				}
				while (st.peek() != '(')
				{
					st.pop();
				}
				st.pop();
			}
		}
		System.out.println(flag);
	}
}