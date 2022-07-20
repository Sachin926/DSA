import java.util.*;
class binSearch
{
	public static void main(String[] args)
	{
		int a[] = {1, 2, 3, 4, 5, 7, 8, 9, 0};
		int n = a.length - 1;
		System.out.println(search(a, n, 5));
	}
	static int search(int a[], int n, int x)
	{
		if (n < 0)
			return -1;
		else
		{
			if (x == a[n])
				return n;
			else
				return search(a, n - 1, x);
		}
	}
	static int max(int a[], int n)
	{
		int mx = -1;
		if (n == 0)
			return a[0];
		else
		{
			if (mx < max(a, n - 1))
				return max(a, n - 1);
			else
				return mx;
		}
	}
	static int[] sort(int a[], int n)
	{
		if (n == 0)
			return a;
		else
		{
			for (int i = 0; i < a.length; i++)
			{
				if (a[n] < max(a, n))
				{
					temp = a[n];
					a[n] = 
				}
			}
		}
	}
}