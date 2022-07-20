/*
For lower triangular matrix, we check the index position i and j i.e row and column respectively. If column position is greater than row position we simply make that position 0.
For upper triangular matrix, we check the index position i and j i.e row and column respectively. If column position is smaller than row position we simply make that position 0.
*/
import java.util.*;
class upperTriangle
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
		//Code for the Upper Triangle
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				if (j < i)
					a[i][j] = 0;
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
				System.out.print(a[i][j] + ", ");
			System.out.println();
		}
	}
}