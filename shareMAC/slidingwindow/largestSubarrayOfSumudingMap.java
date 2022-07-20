import java.util.*;
class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (map.containsKey(sum - k)) {
				if (i - map.get(sum - k) > max) {
					max = i - map.get(sum - k);
				}
			}
			else {
				map.put(sum, i);
			}
		}
		System.out.println(max);
	}
}