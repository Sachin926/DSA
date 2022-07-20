import java.util.*;
class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[ ] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int i = 0;
		int j = 0;
		int sum = 0;
		int max = 0;
		while(j < n) {
			sum = sum + a[i];
			if (sum > k) {
				while (sum > k && i <= j) {
					sum = sum - a[i];
					i++;
				}
				j++;
			}
			else if (sum == k) {
				if (j - i + 1 > max) {
					max = j - i + 1;
				}
				j++;
			}
			else {
				j++;
			}
		}
		System.out.println(max);
	}
}