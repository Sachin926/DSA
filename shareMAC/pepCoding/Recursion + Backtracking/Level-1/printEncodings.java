import java.util.*;
class printEncodings
{
	static String code[] = {"", "a", "b", "c", "d", "e", "f", "g",
	 "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		printEncodings(s, "");
	}
	static void printEncodings(String s, String res)
	{
		if (s.equals(""))
		{
			System.out.println(res);
			return;
		}
		else if (s.charAt(0) == '0')
		{
			return;
		}
		else
		{
			char ch = s.charAt(0);
			printEncodings(s.substring(1), res + code[Integer.parseInt(String.valueOf(ch))]);
			if (s.length() >= 2)
			{
				if (Integer.parseInt(s.substring(0, 2)) <= 26)
				{
					printEncodings(s.substring(2), res + code[Integer.parseInt(s.substring(0, 2))]);
				}
			}
		}
	}
}