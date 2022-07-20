import java.util.*;
class minimumTargetSum
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
		int sum = sc.nextInt();
		System.out.println(minimumSum(a, sum));
	}
	static String minimumSum(int a[], int sum)
	{
		String temp = "";
		if (sum == 0)
		{
			return temp;
		}
		String min = String.valueOf(a);
		for (int i = 0; i < a.length; i++)
		{
			if (sum - a[i] >= 0)
			{
				String res = a[i] + minimumSum(a, sum - a[i]);
				if (res.length() <= min.length())
					min = res;
			}
		}
		return min;
	}
}