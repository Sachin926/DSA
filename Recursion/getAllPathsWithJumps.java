import java.util.*;
class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		getPaths(0, 0, n, m, "");
	}
	static void getPaths(int n, int m, int row, int col, String res) {
		if (n == row - 1 && m == col - 1) {
			System.out.print(res + "  ");
			return;
		}
		if (n >= row || m >= col) {
			return;
		}
		for (int i = 1; i <= 3; i++) {
			getPaths(n, m + i, row, col, res + "H" + i);
		}
		for (int i = 1; i <= 3; i++) {
			getPaths(n + i, m, row, col, res + "V" + i);
		}
	}
}