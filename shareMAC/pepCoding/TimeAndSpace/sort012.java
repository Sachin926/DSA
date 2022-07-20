import java.util.*;
class sort012
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int i = 0;
		int j = 0;
		int k = n - 1;
		while (i <= k)
		{
			if (a[i] == 0)
			{
				swap(a, i, j);
				i++;
				j++;
			}
			else if(a[i] == 1)
			{
				i++;
			}
			else
			{
				swap(a, i, k);
				k--;
			}
		}
		for (i = 0; i < n; i++)
			System.out.print(a[i] + ", ");
	}
	static void swap(int a[], int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}