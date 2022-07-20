import java.util.*;
class descendingSearch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int val = sc.nextInt();
		int lo = 0;
		int hi = a.length - 1;
		while (hi >= lo)
		{
			int mid = (hi + lo) / 2;
			if (val > a[mid])
				hi = mid - 1;
			else if(val < a[mid])
				lo = mid + 1;
			else
			{
				System.out.println(mid);
				return;
			}
		}
		System.out.println("Not Found");
	}
}