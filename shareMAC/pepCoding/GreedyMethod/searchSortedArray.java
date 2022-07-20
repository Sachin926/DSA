import java.util.*;
class searchSortedArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextInt();
		int value = sc.nextInt();
		int j = m - 1;
		int i = 0;
		while (true)
		{
			if (i > n - 1 || j < 0)
			{
				System.out.println("Not Found");
				return;
			}
			else if (a[i][j] == value)
			{
				System.out.println(i + ", " + j);
				return;
			}
			else if (value < a[i][j])
			{
				j--;
			}
			else if (a[i][j] < value)
			{
				i++;
			}
		}
	}
}