import java.util.*;
class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		printAllSumsWithRepetetions(a, sum, "");
	}
	static void printAllSumsWithRepetetions(int a[], int sum, String res) {
		if (sum == 0) {
			System.out.println(res);
			return;
		}
		if (sum < 0) {
			return;
		}
		for (int i = 0; i < a.length; i++) {
			printAllSums(a, sum - a[i], res + a[i] + ", ");
		}
	}
}