import java.util.*;
class ceilFloor
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
		int floor = Integer.MIN_VALUE;
		int ceil = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++)
		{
			if (a[i] < val && a[i] > floor)
				floor = a[i];
			if (a[i] > val && a[i] < ceil)
				ceil = a[i];
		}
		System.out.printf("CEIL = %d, FLOOR = %d", ceil, floor);
	}
}