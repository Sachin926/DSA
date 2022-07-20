import java.util.*;
class maxInEachWindow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int k = sc.nextInt();
		int i = 0;
		int j = 0;
		int max = Integer.MIN_VALUE;
		int last = Integer.MIN_VALUE;
		ArrayList<Integer> res = new ArrayList<>();
		while (j < n) {
			if (a[j] >= max) {
				last = max;
				max = a[j];
			}
			if (j - i + 1 == k) {
				res.add(max);
				if (a[i] == max) {
					max = last;
				}
				i++;
				j++;
			}
			else {
				j++;
			}
		}
		System.out.println(res);
	}
}