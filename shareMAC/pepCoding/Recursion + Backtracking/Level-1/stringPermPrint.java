import java.util.*;
class stringPermPrint
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		printPerm(s, "");
	}
	static void printPerm(String s, String res)
	{
		if (s.length() == 0)
		{
			System.out.println(res);
			return;
		}
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			String temp = s.substring(0, i) + s.substring(i + 1);
			printPerm(temp, res + ch);
		}
	}
}