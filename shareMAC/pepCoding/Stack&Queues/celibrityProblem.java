import java.util.*;
class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++) {
			st.push(i);
		}
		while (st.size() != 1) {
			int i = st.pop();
			int j = st.pop();
			if (a[i][j] == 1 && i != j) {
				st.push(j);
			}
			else if (i != j){
				st.push(i);
			}
		}
		int k = st.pop();
		for (int i = 0; i < n; i++) {
			if (a[i][k] == 0 && i != k) {
				System.out.println("NONE");
				return;
			}
		}
		System.out.println(k);
	}
}