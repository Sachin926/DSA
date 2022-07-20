import java.util.*;
class firstOccurance
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
		System.out.println(occurance(a, n - 1, 4));
	}
	static int occurance(int a[], int n, int x)
	{
		if (n < 0)
			return -1;
		if (occurance(a, n - 1, x) != -1)
			return occurance(a, n - 1, x);
		else if (a[n] == x)
			return n;
		else
			return occurance(a, n - 1, x);
	}
}
