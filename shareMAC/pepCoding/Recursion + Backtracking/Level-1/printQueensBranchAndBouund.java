import java.util.*;
class printQueensBranchAndBouund
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int chess[][] = new int[n][n];
		boolean col[] = new boolean[n];
		boolean normalDiag[] = new boolean[2 * n - 1];
		boolean rightDiag[] = new boolean[2 * n - 1];
		printQueensBranchAndBouund(chess, 0, col, normalDiag, rightDiag, "");
	}
	static void printQueensBranchAndBouund(int chess[][], int n, boolean col[], boolean normalDiag[], boolean rightDiag[], String res)
	{
		if (n == chess.length)
		{
			System.out.println(res + ".");
			return;
		}
		for (int i = 0; i < chess.length; i++)
		{
			if (col[i] != true && normalDiag[n + i] != true && rightDiag[n - i + chess.length - 1] != true)
			{
				chess[n][i] = 1;
				col[i] = true;
				normalDiag[n + i] = true;
				rightDiag[n - i + chess.length - 1] = true;
				printQueensBranchAndBouund(chess, n + 1, col, normalDiag, rightDiag, res + i + "-" + n + ", ");
				//BackTracking
				col[i] = false;
				normalDiag[n + i] = false;
				rightDiag[n - i + chess.length - 1] = false;
				chess[n][i] = 0;
			}
		}
	}
}