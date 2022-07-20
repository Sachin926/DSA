import java.util.*;
class binSequence
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		binSequence(n, " ");
	}
	static void binSequence(int n, String res)
	{
		if (n == 0)
		{
			System.out.println(res);
			return;
		}
		binSequence(n - 1, res + "0");
		if (res.charAt(res.length() - 1) != '1')
		{
			binSequence(n - 1, res + "1");
		}
	}
}