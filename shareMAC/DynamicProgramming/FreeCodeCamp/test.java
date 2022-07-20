import java.util.*;
class test
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
}