import java.util.*;
class printArray
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
		printArray(a, n - 1);
	}
	static void printArray(int a[], int n)
	{
		if (n < 0)
			return;
		else
		{
			printArray(a, n - 1);
			System.out.println(a[n]);
		}
	}
}