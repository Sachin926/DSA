import java.util.*;
class maxSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int curSum = 0;
		int i = 0;
		int j = 0;
		while (j < n) {
			curSum += a[j];
			if (j - i + 1 < k) {
				j++;
			}
			else if (j - i + 1 == k) {
				max = Math.max(curSum, max);
				curSum = curSum - a[i];
				i++;
				j++;
			}
		}
		System.out.println(max);
	}
}