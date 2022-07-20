import java.util.*;
class test
{
	public static void main(String[] args)
	{
		//System.out.println(pathTraveller(3, 3));
		int a[] = {5, 3, 4};
		System.out.println(canSum(a, 7));
		ArrayList b = ArrayList.asList(a);
		System.out.println(howSum(b, 7));
	}
	static ArrayList howSum(ArrayList a, int n)
	{
		ArrayList<ArrayList<Integer>> res = 
								new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n + 1; i++)
			res.add(new ArrayList());
		//list.set(0, null);
		for (int i = 1; i < n + 1; i++)
		{
			res.set(i, null);
		}
		System.out.println(a.get(0));
		for (int i = 0; i < n + 1; i++)
		{
			if (res.get(i) != None)
			{
				for (int j = 0; j < a.size(); j++)
				{
					if (i + a.get(j) <= n)
					{
						if (i != 0)
						{
							int temp[] = {i, a.get(j)};
							res.set(i + a.get(j), ArrayList.asList(temp));
						}
						else
						{
							int temp[] = {a.get(j)};
							res.set(i + a.get(j), temp);
						}
					}
				}
			}
		}
		return res;
	}
	static boolean canSum(int a[], int n)
	{
		boolean res[] = new boolean[n + 1];
		for (int i = 0;i < n + 1; i++)
			if (i == 0)
				res[i] = true;
			else
				res[i] = false;
		for (int i = 0; i < res.length; i++)
		{
			if (res[i] == true)
				for (int j = 0; j < a.length; j++)
				{
					if ((i + a[j]) < res.length)
					{
						res[i + a[j]] = true;
					}
				}
		}
		for (int i = 0; i < n + 1; i++)
			System.out.print(res[i] + ", ");
		System.out.println();
		return res[n];
	}
	static int pathTraveller(int m, int n)
	{
		int a[][] = new int [m + 1][n + 1];
		for (int i = 0; i < m + 1; i++)
		{
			for (int j = 0; j < n + 1; j++)
			{
				a[i][j] = 0;
			}
		}
		a[1][1] = 1;
		for (int i = 0; i < m + 1; i++)
		{
			for (int j = 0; j < n + 1; j++)
			{
				if (i + 1 < m + 1)
					a[i + 1][j] += a[i][j];
				if (j + 1 < n + 1)
					a[i][j + 1] += a[i][j];
			}
		}
		return a[m][n];
	}
}