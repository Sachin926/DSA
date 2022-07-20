import java.util.*;
class rotate90
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = {{1, 2, 3, 4},
					{5, 6, 7, 8}, 
					{9, 10, 11, 12}, 
					{13, 14, 15, 16}};
		int b[][] = new int[4][4];
		int c[][] = new int[4][4];
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				b[i][j] = a[j][i];
			}
		}
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				c[3 - i][j] = b[i][j];
			}
		}


		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
				System.out.print(c[i][j] + "  ");
			System.out.println();
		}
	}
}