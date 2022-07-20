import java.util.*;
class printN_Queens
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int chess[][] = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				chess[i][j] = 0;
		printN_Queens(chess, 0, "");
	}
	static void printN_Queens(int chess[][], int n, String res)
	{
		if (n == chess.length)
		{
			System.out.println(res + ".");
			return;
		}
		for (int i = 0; i < chess.length; i++)
		{
			if (isSafe(chess, n, i) == true)
			{
				chess[n][i] = 1;
				printN_Queens(chess, n + 1, res + n + "-" + i + ", ");
				chess[n][i] = 0;
			}
		}
	}
	static boolean isSafe(int chess[][], int r, int c)
	{
		for (int j = c, i = r - 1; i >= 0; i--)
		{
			if (chess[i][j] == 1)
				return false;
		}
		for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--)
		{
			if (chess[i][j] == 1)
				return false;
		}
		for (int i = r - 1, j = c + 1; i >= 0 && j < chess.length; i--, j++)
		{
			if (chess[i][j] == 1)
				return false;
		}
		return true;
	}
}