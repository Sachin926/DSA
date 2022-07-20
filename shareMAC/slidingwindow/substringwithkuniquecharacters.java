import java.util.*;
class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = sc.nextInt();
		int n = s.length();
		HashMap<Character, Integer> map = new HashMap<>();
		int i = 0;
		int j = 0;
		int max = 0;
		while (j < n) {
			if (map.containsKey(s.charAt(j))) {
				map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
			}
			else {
				map.put(s.charAt(j), 1);
			}
			if (map.size() == k) {
				if (j - i + 1 > max) {
					max = j - i + 1;
				}
				j++;
			}
			else if (map.size() > k) {
				while (map.size() > k) {
					map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
					if (map.get(s.charAt(i)) == 0) {
						map.remove(s.charAt(i));
					}
					i++;
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