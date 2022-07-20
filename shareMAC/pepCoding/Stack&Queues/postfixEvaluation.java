import java.util.*;
class postfixEvaluation
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String exp = sc.nextLine();
		Stack<Integer> val = new Stack<>();
		Stack<String> infix = new Stack<>();
		Stack<String> prefix = new Stack<>();
		for (int i = 0; i < exp.length(); i++)
		{
			char ch = exp.charAt(i);
			if (Character.isDigit(ch))
			{
				val.push(Integer.parseInt("" + ch));
				infix.push("" + ch);
				prefix.push("" + ch);
			}
			else
			{
				valueCalculate(val, ch);
				infixCalculate(infix, ch);
				prefixCalculate(prefix, ch);
			}
		}
		System.out.println(val.peek());
		System.out.println(infix.peek());
		System.out.println(prefix.peek());
	}
	static void prefixCalculate(Stack<String> prefix, char ch)
	{
		String b = prefix.pop();
		String a = prefix.pop();
		String c = ch + a + b;
		prefix.push(c);
	}
	static void valueCalculate(Stack<Integer> val, char ch)
	{
		int b = val.pop();
		int a = val.pop();
		int c = calculate(a, b, ch);
		val.push(c);
	}
	static void infixCalculate(Stack<String> infix, char ch)
	{
		String b = infix.pop();
		String a = infix.pop();
		String c = "(" + a + ch + b + ")";
		infix.push(c);
	}
	static int calculate(int a, int b, char ch)
	{
		if (ch == '+')
			return a + b;
		else if (ch == '-')
			return a - b;
		else if (ch == '*')
			return a * b;
		else
			return a / b;
	}
}