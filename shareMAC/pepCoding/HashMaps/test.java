import java.util.*;
class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(maxElement(s));
	}
	static String maxElement(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		int max = Integer.MIN_VALUE;
		String val = "";
		int n = s.length();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
			else {
				map.put(s.charAt(i), 1);
			}
			if (map.get(s.charAt(i)) > max) {
				max = map.get(s.charAt(i));
				val = "" + s.charAt(i);
			}
		}
		return val;
	}
}