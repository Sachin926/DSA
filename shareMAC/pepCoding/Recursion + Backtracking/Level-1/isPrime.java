import java.util.*;
class test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPrime(n, n - 1));
	}
	static boolean isPrime(int n, int i)
	{
		if (i == 2)
		{
			if (n % i == 0)
				return false;
			else
				return true;
		}
		if (isPrime(n, i - 1) == true)
		{
			if (n % i != 0)
			{
				return true;
			}
		} 
		return false;
	}
}