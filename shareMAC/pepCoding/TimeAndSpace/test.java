import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String in[] = s.split("[.]");
		if (in.length > 2) {
			System.out.println("false");
			return;
		}
		else {
			if (checkInteger(in[0]) && checkDecimal(in[1])) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		}
	}
	public static boolean checkInteger(String s) {
		String in[] = s.split(",");
		for (int i = 0; i < in.length; i++) {
			if (i != 0 && in[i].length() != 3) {
				return false;
			}
		}
		return true;
	}
	public static boolean checkDecimal(String s) {
		String in[] = s.split(",");
		if (in.length > 1) {
			return false;
		}
		else {
			return true;
		}
	}
}