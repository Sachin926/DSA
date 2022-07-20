import java.util.*;
class printDiagonals
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextInt();
		System.out.println("Result-->");
		for (int g = 0; g < n; g++)
			for (int i = 0, j = g; j < n; i++, j++)
			{
				System.out.println(a[i][j]);
			}

	}
}