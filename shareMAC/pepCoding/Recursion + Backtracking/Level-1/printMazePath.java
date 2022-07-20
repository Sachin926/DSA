import java.util.*;
class printMazePath
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		printMazePath(1, 1, m, n, "");
	}
	static void printMazePath(int r, int c, int m, int n, String res)
	{
		if (r == m && c == n)
		{
			System.out.print(res + ", ");
			return;
		}
		if (c < n)
		{
			printMazePath(r, c + 1, m, n, "h" + res);
		}
		if (r < m)
		{
			printMazePath(r + 1, c, m, n, "v" + res);
		}
	}
}