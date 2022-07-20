import java.util.*;
class test {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n = s.length();
    Stack<Character> operator = new Stack<>();
    Stack<String> operand = new Stack<>();
    for (int i = 0; i < n; i++) {
        char ch = s.charAt(i);
        if (Character.isDigit(ch)) {
            operand.push("" + ch);
        }
        else if (ch == '(') {
            operator.push(ch);
        }
        else if (ch == ')') {
            while (operator.peek() != '(') {
                String b = operand.pop();
                String a = operand.pop();
                operand.push(a + b + operator.pop());
            }
            operator.pop();
        }
        else {
            while (operator.size() > 0 && operator.peek() != '(' && precedence(operator.peek()) >= precedence(ch)) {
                String b = operand.pop();
                String a = operand.pop();
                operand.push(a + b + operator.pop());
            }
            operator.push(ch);
        }
    }
    while (operator.size() > 0) {
        String b = operand.pop();
        String a = operand.pop();
        operand.push(a + b + operator.pop());
    }
    System.out.println(operand.pop());
}
    static int precedence(char ch) {
        if (ch == '*' || ch == '/') {
            return 2;
        }
        else {
            return 1;
        }
    }
}