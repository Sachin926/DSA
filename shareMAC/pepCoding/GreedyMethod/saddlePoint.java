import java.util.*;
class test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < m; i++)
		{
			int min = 0;
			for (int j = 1; j < n; j++)
			{
				if (a[i][min] > a[i][j])
					min = j;
			}
			flag = true;
			for (int k = 0; k < m; k++)
			{
				if (a[i][min] < a[k][min])
				{
					flag = false;
					break;
				}
			}
			if (flag == true)
			{
				System.out.println(a[i][min]);
				break;
			}
		}
		if (flag == false)
			System.out.println("Invalid");
	}
}