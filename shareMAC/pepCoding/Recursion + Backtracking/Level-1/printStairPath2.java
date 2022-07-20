import java.util.*;
class printStairPath
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printStairPath(n, "");
	}
	static void printStairPath(int n, String res)
	{
		if (n == 0)
		{
			System.out.print(res + ", ");
			return;
		}
		else if (n < 0)
		{
			return;
		}
		for (int i = 1; i < 4; i++)
		{
			int pos = n - i;
			printStairPath(pos, res + i);
		}
	}
}