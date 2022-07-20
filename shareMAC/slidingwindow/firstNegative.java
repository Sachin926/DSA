import java.util.*;
class firstNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		ArrayList<Integer> res = new ArrayList<>();
		int i = 0;
		int j = 0;
		while (j < n) {
			if (a[j] < 0) {
				res.add(a[j]);
			}
			if (j - i + 1 == k) {
				if (res.size() > 0)
					System.out.println(res.get(0));
				if (res.size() != 0 && a[i] == res.get(0)) {
					res.remove(0);
				}
				else if (res.size() == 0) {
					System.out.println(0);
				}
				i++;
				j++;
			}
			else {
				j++;
			}
		}
	}
}