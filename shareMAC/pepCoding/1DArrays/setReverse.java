import java.util.*;
class setReverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i < n; i++)
		{
			temp.add(a[i]);
			if ((i + 1) % k == 0 || i == n - 1)
			{
				printReverse(temp);
				temp.clear();
			}
		}
	}
	static void printReverse(ArrayList<Integer> list)
	{
		for (int i = list.size() - 1; i >= 0; i--)
			System.out.print(list.get(i) + ", ");
	}
}