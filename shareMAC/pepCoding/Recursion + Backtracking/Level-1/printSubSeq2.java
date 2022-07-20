import java.util.*;
class printSubSeq
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		printSubSeq(s, "");
	}
	static void printSubSeq(String s, String res)
	{
		if (s.equals(""))
		{
			System.out.print(res + ",");
			return;
		}
		char ch = s.charAt(0);
		String str = s.substring(1);
		printSubSeq(str, res + "");
		printSubSeq(str, res + ch);
	}
}