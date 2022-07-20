import java.util.*;
class count
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int val = sc.nextInt();
		Arrays.sort(a);
		int lo = 0;
		int hi = a.length - 1;
		int li = -1;
		int fi = -1;
		while (hi >= lo)
		{
			int mid = (hi + lo) / 2;
			if (val > a[mid])
				lo = mid + 1;
			else if(val < a[mid])
				hi = mid - 1;
			else
			{
				li = mid;
				lo = mid + 1;
			}
		}
		lo = 0;
		hi = a.length - 1;
		while (hi >= lo)
		{
			int mid = (hi + lo) / 2;
			if (val > a[mid])
				lo = mid + 1;
			else if(val < a[mid])
				hi = mid - 1;
			else
			{
				fi = mid;
				break;
			}
		}
		int count = li - fi + 1;
		System.out.printf("Count of %d is %d", val, count);
	}
}