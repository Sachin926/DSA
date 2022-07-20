import java.util.*;
class firstAndLastIndex
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int val = sc.nextInt();
		int lo = 0;
		int hi = a.length - 1;
		int li = -1;
		while (hi >= lo)
		{
			int mid = (hi + lo) / 2;
			if (a[mid] < val)
			{
				hi = mid - 1;
			}
			else if(a[mid] > val)
			{
				lo = mid + 1;
			}
			else
			{
				li = mid;
				lo = mid + 1;
			}
		}
		int fi = -1;
		hi = a.length - 1;
		lo = 0;
		while (hi >= lo)
		{
			int mid = (hi + lo) / 2;
			if (val > a[mid])
			{
				lo = mid + 1;
			}
			else if(val < a[mid])
			{
				hi = mid - 1;
			}
			else
			{
				fi = mid;
				break;
			}
		}
		System.out.println(fi + "-" + li);
	}
}