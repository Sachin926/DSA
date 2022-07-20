import java.util.*;
class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack<Integer> operand = new Stack<>();
		Stack<Character> operator = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				operand.push(Integer.parseInt("" + ch));
			}
			else if(ch == '(') {
				operator.push(ch);
			}
			else if (ch == ')') {
				while (operator.peek() != '(') {
					int b = operand.pop();
					int a = operand.pop();
					operand.push(calculate(a, b, operator.pop()));
				}
				operator.pop();
			}
			else {
				while (operator.size() > 0 && operator.peek() != '(' && operator.peek() != ')' && precedence(operator.peek()) >= precedence(ch)) {
					int b = operand.pop();
					int a = operand.pop();
					operand.push(calculate(a, b, operator.pop()));
				}
				operator.push(ch);
			}
		}
		while(operator.size() > 0) {
			int b = operand.pop();
			int a = operand.pop();
			operand.push(calculate(a, b, operator.pop()));
		}
		System.out.println(operand.pop());
	}
	static int calculate(int a, int b, char ch) {
		switch (ch) {
			case '+': return a + b;
			case '-': return a - b;
			case '*': return a * b;
			case '/': return a / b;
		}
		return -1;
	}
	static int precedence(char ch) {
		switch(ch) {
			case '+': return 1;
			case '-': return 1;
			case '*': return 2;
			case '/': return 2;
		}
		return -1;
	}
}