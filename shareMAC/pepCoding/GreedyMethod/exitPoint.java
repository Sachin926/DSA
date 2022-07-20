import java.util.*;
class exitPoint
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
		int dir = 0;
		int i = 0, j = 0;
		while (true)
		{
			dir = (dir + a[i][j]) % 4;
			if (dir == 0)
			{
				j++;
			}
			else if(dir == 1)
			{
				i++;
			}
			else if(dir == 2)
			{
				j--;
			}
			else if (dir == 3)
			{
				i--;
			}
			if (i == m)
			{
				i--;
				break;
			}
			else if(j == n)
			{
				j--;
				break;
			}
			else if(i < 0)
			{
				i++;
				break;
			}
			else if(j == m)
			{
				j++;
				break;
			}
		}
		System.out.printf("( %d, %d )", i, j);
	}
}