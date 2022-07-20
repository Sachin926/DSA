import java.util.*;
class waveTravesal
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
		System.out.println("Result -->");
		for (int i = 0; i < n; i++)
		{
			if (i % 2 == 0)
			{
				for (int j = 0; j < m; j++)
					System.out.println(a[j][i]);
			}
			if (i % 2 != 0)
			{
				for (int j = m - 1; j >= 0; j--)
				{
					System.out.println(a[j][i]);
				}
			}
		}
	}
}