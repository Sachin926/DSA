import java.util.*;
class infixCalculation
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack<Character> operator = new Stack<>();
		Stack<Integer> operand = new Stack<>();
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if (ch == '(')
			{
				operator.push(ch);
			}
			else if (Character.isDigit(ch))
			{
				operand.push(Integer.parseInt("" + ch));
			}
			else if (ch == ')')
			{
				while (operator.peek() != '(')
				{
					int b = operand.peek();
					operand.pop();
					int a = operand.peek();
					operand.pop();
					operand.push(calculate(a, b, operator.peek()));
					operator.pop();
				}
				operator.pop();
			}
			else if (isOperator(ch))
			{
				while(operator.size() != 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek()))
				{
					int b = operand.peek();
					operand.pop();
					int a = operand.peek();
					operand.pop();
					operand.push(calculate(a, b, operator.peek()));
					operator.pop();
				}
				operator.push(ch);
			}
		}
		while (operator.size() != 0)
		{
			int b = operand.peek();
			operand.pop();
			int a = operand.peek();
			operand.pop();
			operand.push(calculate(a, b, operator.peek()));
			operator.pop();
		}
		System.out.println(operand.peek());
	}
	static boolean isOperator(char ch)
	{
		if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
			return true;
		else
			return false;
	}
	static int calculate(int a, int b, char ch)
	{
		switch(ch)
		{
			case '+':
			return a + b;
			case '-':
			return a - b;
			case '*':
			return a * b;
			case '/':
			return a / b;
		}
		return -1;
	}
	static int precedence(char ch)
	{
		switch(ch)
		{
			case '+':
			return 1;
			case '-':
			return 1;
			case '*':
			return 2;
			case '/':
			return 2;
		}
		return -1;
	}
}