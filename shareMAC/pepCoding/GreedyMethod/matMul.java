import java.util.*;
class matMul
{
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ra = sc.nextInt();
		int ca = sc.nextInt();
		int a[][] = new int[ra][ca];
		for(int i = 0; i < ra; i++)
			for (int j = 0; j < ca; j++)
				a[i][j] = sc.nextInt();
		int rb = sc.nextInt();
		int cb = sc.nextInt();
		int b[][] = new int[rb][cb];
		for(int i = 0; i < rb; i++)
			for (int j = 0; j < cb; j++)
				b[i][j] = sc.nextInt();
		int c[][] = new int[ra][cb];
		if (ca != rb)
		{
			System.out.println("Multiplication Not Possible");
			return;
		}
		else
		{
			for (int i = 0; i < ra; i++)
				for (int j = 0; j < cb; j++)
					for (int k = 0; k < ra; k++)
					{
						c[i][j] += a[i][k] * b[k][j];
					}
		}
		for (int i = 0; i < ra; i++)
		{
			for (int j = 0; j < cb; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}
	}
}