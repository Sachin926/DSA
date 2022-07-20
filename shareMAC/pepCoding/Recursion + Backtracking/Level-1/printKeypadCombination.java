import java.util.*;
class printKeypadCombination
{
	static String[] keypad = {"?!", "abc", "def", "ghi", "jkl", "mnop", "qrst", "uv", "wxyz", ".,"};
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		printKeypadCombination(s, "");
	}
	static void printKeypadCombination(String s, String res)
	{
		if (s == "")
		{
			System.out.print(res + ", ");
			return;
		}
		char ch = s.charAt(0);
		String str = s.substring(1);
		int index = Integer.parseInt(String.valueOf(ch));
		String comb = keypad[index];
		for (int i = 0; i < comb.length(); i++)
		{
			printKeypadCombination(str, res + comb.charAt(i));
		}
	}
}