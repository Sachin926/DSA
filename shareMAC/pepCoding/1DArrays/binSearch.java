import java.util.*;
class test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int val = sc.nextInt();
		int hi = a.length - 1;
		int lo = 0;
		Arrays.sort(a);
		while (hi >= lo)
		{
			int mid = (hi + lo) / 2;
			if (a[mid] == val)
			{
				System.out.printf("found at %d", mid);
				return;
			}
			else if(val < a[mid])
			{
				hi = mid - 1;
			}
			else
			{
				lo = mid + 1;
			}
		}
		System.out.println("Element not found");
	}
}