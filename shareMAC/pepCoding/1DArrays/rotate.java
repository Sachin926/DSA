import java.util.*;
class rotate
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int k = sc.nextInt();
		k = k % a.length;
		reverse(a, 0, k);
		reverse(a, k + 1, a.length - 1);
		reverse(a, 0, a.length - 1);
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + ", ");
	}
	static void reverse(int a[], int l, int h)
	{
		while (l < h)
		{
			int temp = a[l];
			a[l] = a[h];
			a[h] = temp;
			l++;
			h--;
		}
	}
}