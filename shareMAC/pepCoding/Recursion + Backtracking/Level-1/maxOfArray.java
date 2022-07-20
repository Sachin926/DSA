import java.util.*;
class findMax
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Maximum is = " + findMax(a, n - 1));
	}
	static int findMax(int a[], int n)
	{
		if (n == 0)
			return a[n];
		else
		{
			if (a[n] >= findMax(a, n - 1))
				return a[n];
			else
				return findMax(a, n - 1);
		}
	}
}
