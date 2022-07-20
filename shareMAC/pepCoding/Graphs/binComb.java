import java.util.*;
class binComb
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		getCombination(n, "");
	}
	static boolean checkEquality(String str)
	{
		int mid = str.length() / 2;
		int lhs = 0;
		int rhs = 0;
		int i, j;
		for (i = 0, j = mid; i < mid; i++, j++)
		{
			if (str.charAt(i) == '1')
				lhs++;
			if (str.charAt(j) == '1')
				rhs++;
		}
		if (lhs == rhs)
			return true;
		else
			return false;
	}
	static void getCombination(int n, String res)
	{
		if (n == 0)
		{
			if (checkEquality(res) == true)
			{
				System.out.println(res);
			}
			return;
		}
		getCombination(n - 2, 0 + res + 0);
		getCombination(n - 2, 0 + res + 1);
		getCombination(n - 2, 1 + res + 0);
		getCombination(n - 2, 1 + res + 1);
	}
}