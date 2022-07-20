import java.util.*;
class infixConversion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack<String> prefix = new Stack<>();
		Stack<String> postfix = new Stack<>();
		Stack<Character> operator = new Stack<>();
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if (Character.isDigit(ch))
			{
				prefix.push("" + ch);
				postfix.push("" + ch);
			}
			else if (isOperator(ch))
			{
				while (operator.size() > 0 && preferrence(operator.peek()) >= preferrence(ch) && operator.peek() != '(')
				{
					String b = prefix.pop();
					String a = prefix.pop();
					prefix.push(a + b + operator.peek());
					String bPost = postfix.pop();
					String aPost = postfix.pop();
					postfix.push(operator.peek() + aPost + bPost);
					operator.pop();
				}
				operator.push(ch);
			}
			else if (ch == '(')
				operator.push(ch);
			else if (ch == ')')
			{
				while (operator.peek() != '(')
				{
					String b = prefix.pop();
					String a = prefix.pop();
					prefix.push(a + b + operator.peek());
					String bPost = postfix.pop();
					String aPost = postfix.pop();
					postfix.push(operator.peek() + aPost + bPost);
					operator.pop();
				}
				operator.pop();
			}
		}
		while (operator.size() > 0)
			{
				String b = prefix.pop();
				String a = prefix.pop();
				prefix.push(a + b + operator.peek());
				String bPost = postfix.pop();
				String aPost = postfix.pop();
				postfix.push(operator.peek() + aPost + bPost);
				operator.pop();
			}
		System.out.println(prefix.peek());
		System.out.println(postfix.peek());
	}
	static boolean isOperator(char ch)
	{
		if (ch == '*' || ch == '/' || ch == '-' || ch == '+')
			return true;
		else
			return false;
	}
	static int preferrence(char ch)
	{
		if (ch == '*' || ch == '/')
			return 2;
		else if(ch == '+' || ch == '-')
			return 1;
		else
			return -1;
	}
}