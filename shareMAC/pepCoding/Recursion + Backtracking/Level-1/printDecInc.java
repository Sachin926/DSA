import java.util.*;
class printDecInc
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PDI(n);
	}
	static void PDI(int n)
	{
		if (n == 0)
			return;
		else
		{
			System.out.println(n);
			PDI(n - 1);
			System.out.println(n);
		}
	}
}