import java.util.*;
class equalSumPartition
{
	public static void main(String[] args)
	{
		int arr[] = {1, 5, 11, 5};
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum = sum + arr[i];
		if (sum % 2 != 0)
			return;
		else
			System.out.println(checkSum(arr, 4, 29));
	}
	static int checkSum(int a[], int n, int sum)
	{
		int t[][] = new int[n + 1][sum + 1];
		for (int i = 0; i < n + 1; i++)//Array
			for(int j = 0; j < sum + 1; j++)//sum
			{
				if (j == 0)
					t[i][j] = 1;
				if (i == 0 && j != 0)
					t[i][j] = 0;
			}
		for (int i = 1; i < n + 1; i++)//Array
			for(int j = 1; j < sum + 1; j++)//sum
			{
				if (a[i - 1] <= j)
				{
					t[i][j] = t[i - 1][j] + t[i - 1][j - a[i - 1]];
				}
				else
					t[i][j] = t[i - 1][j];
			}
		return t[n][sum];
	}
}