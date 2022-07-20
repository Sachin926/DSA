import java.util.*;
class reverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int li = 0, ri = a.length - 1;
		while (li < ri)
		{
			int temp = a[li];
			a[li] = a[ri];
			a[ri] = temp;
			li++;
			ri--;
		}
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + ", ");
	}
}