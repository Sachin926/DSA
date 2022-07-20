import java.util.*;
class shelllRotate
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
		int rot = sc.nextInt();
		int shell = sc.nextInt();
		int minRow = shell - 1;
		int minCol = shell - 1;
		int maxRow = a.length - shell;
		int maxCol = a[0].length - shell;
		int arr[] = new int[2 * (maxRow - minRow) + 2 * (maxCol - minCol) - 4];
		System.out.println(arr.length);
		//leftWall
		int k = 0;
		for (int i = minRow; i < maxRow; i++, k++)
		{
			arr[k] = a[i][minCol];
			maxRow++;
		}
		//BottomWall
		for (int j = minCol; j < maxCol; j++, k++)
		{
			arr[k] = a[maxRow][j];
			maxRow--;
		}
		//RightWall
		for (int i = maxRow; i >= minRow; i--, k++)
		{
			arr[k] = a[i][maxCol];
			maxCol--;
		}
		//TopWall
		for (int j = maxCol; j >= minCol; j--, k++)
		{
			arr[k] = a[minRow][j];
			minRow--;
		}
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");
	}
}