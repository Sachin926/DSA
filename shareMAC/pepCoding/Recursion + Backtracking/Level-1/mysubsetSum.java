import java.util.*;
class mysubsetSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		subsetSum(a, sum, list);
	}
	static int[] deleteIndex(int a[], int n)
	{
		int b[] = new int[a.length - 1];
		int count = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (i == n)
				continue;
			else
			{
				b[count] = a[i];
				count++;
			}
		}
		return b;
	}
	static void subsetSum(int a[], int sum, ArrayList<Integer> res)
	{
		if (sum < 0 || a.length == 0)
			return;
		if (sum == 0)
		{
			System.out.println(res);
			return;
		}

		for (int i = 0; i < a.length; i++)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(a[i]);
			for (int j = 0; j < res.size(); j++)
				temp.add(res.get(j));
			int k = sum - a[i];
			int b[] = deleteIndex(a, i);
			subsetSum(b, k, temp);
		}
	}
}