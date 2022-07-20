import java.util.*;
class transpose
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		for(int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextInt();
		//transpose code
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
			{
				if (j < i)
				{
					int temp = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = temp;
				}
			}
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
				System.out.print(a[i][j] + ", ");
			System.out.println();
		}
	}
}