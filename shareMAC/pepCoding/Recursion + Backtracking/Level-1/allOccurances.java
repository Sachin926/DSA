import java.util.*;
class allOccurances
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println(allOccurance(a, n - 1, 4, list));
	}
	static ArrayList allOccurance(int a[], int n, int x, ArrayList list)
	{
		if (n < 0)
			list.add(-1);
		else
		{
			if (a[n] == x)
			{
				list.add(n);
				allOccurance(a, n - 1, x, list);
			}
		}
		return list;
	}
}
