import java.util.*;
class spiralMatrix
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
		int maxRow = m - 1;
		int maxCol = n - 1;
		int minRow = 0;
		int minCol = 0;
		int count = 0;
		System.out.println("Result-->");
		while (count < n * m)
		{
			//Left Wall
			for (int i = 0, j = minRow; i <= maxRow && count < n * m; i++)
			{
				System.out.println(a[i][j]);
				count++;
			}
			minCol++;
			//BottomWall
			for (int j = minCol, i = maxRow; j <= maxCol && count < n * m; j++)
			{
				System.out.println(a[i][j]);
				count++;
			}
			maxRow--;
			//RigthWall
			for (int i = maxRow, j = maxCol; i >= minRow && count < n * m; i--)
			{
				System.out.println(a[i][j]);
				count++;
			}
			maxCol--;
			//TopWall
			for (int j = maxCol, i = minRow; j >= minCol && count < n * m; j--)
			{
				System.out.println(a[i][j]);
				count++;
			}
			minRow++;
		}
	}
}