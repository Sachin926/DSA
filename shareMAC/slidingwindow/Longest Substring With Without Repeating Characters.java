import java.util.*;
class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i = 0;
		int j = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		int n = s.length();
		int max = 0;
		while (j < n) {
			if (map.containsKey(s.charAt(j))) {
				map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
			}
			else {
				map.put(s.charAt(j), 1);
			}
			if (map.size() == j - i + 1) {
				max = Math.max(map.size(), max);
				j++;
			}
			else if (map.size() < j - i + 1) {
				while (s.charAt(i) != s.charAt(j)) {
					map.remove(s.charAt(i));
					i++;
				}
				map.put(s.charAt(j), 1);
				j++;
			}
			else {
				j++;
			}
		}
		System.out.println(max);
	}
}