import java.util.*;
class balancedBrackets
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String open = "{[(";
		String close = "}])";
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++)
		{
			if (isBracket(open, s.charAt(i)) == true)
			{
				st.push(s.charAt(i));
			}
			else if (isBracket(close, s.charAt(i)) == true)
			{
				if (st.size() > 0)
				{
					if (st.peek() == open.charAt(close.indexOf(s.charAt(i))))
						st.pop();
					else
					{
						System.out.println("false");
						return;
					}
				}
				else
				{
					System.out.println("false");
					return;
				}
			}
		}
		if (st.size() == 0)
			System.out.println("true");
		else
			System.out.println("false");
	}
	static boolean isBracket(String s, char ch)
	{
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == ch)
				return true;
		}
		return false;
	}
}