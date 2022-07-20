import java.util.*;
class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (Character.isDigit(s.charAt(i))) {
                st.push(Integer.parseInt("" + s.charAt(i)));
            }
            else {
                int a = st.pop();
                int b = st.pop();
                st.push(calculate(a, b, s.charAt(i)));
            }
        }
        System.out.println(st.pop());
    }
    static int calculate(int a, int b, char ch) {
        switch(ch) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        return -1;
    }
}