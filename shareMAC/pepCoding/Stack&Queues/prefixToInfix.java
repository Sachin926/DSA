import java.util.*;
class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack<String> st = new Stack<>();
		int n = s.length();
		for (int i = n - 1; i >= 0; i--) {
			if (Character.isDigit(s.charAt(i))) {
				st.push("" + s.charAt(i));
			}
			else {
				String a = st.pop();
				String b = st.pop();
				String c = "(" + a + s.charAt(i) +  b + ")";
				st.push(c);
			}
		}
		System.out.println(st.pop());
	}
}