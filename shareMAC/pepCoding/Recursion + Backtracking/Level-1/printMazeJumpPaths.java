import java.util.*;
class printMazeJumpPaths
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		printMazeJumpPaths(1, 1, m, n, "");
	}
	static void printMazeJumpPaths(int r, int c, int m, int n, String res)
	{
		if (r == m && c == n)
		{
			System.out.print(res + ", ");
			return;
		}
		for (int h = 1; h <= n - c; h++)
		{
			printMazeJumpPaths(r, c + h, m, n, res + "h" + h);
		}
		for (int v = 1; v <= m - r; v++)
		{
			printMazeJumpPaths(r + v, c, m, n, res + "v" + v);
		}
		for (int d = 1; d <= n - c && d <= m - r; d++)
		{
			printMazeJumpPaths(r + d, c + d, m, n, res + "d" + d);
		}
	}
}