import java.util.*;
class mergeSortedArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {2, 5, 12, 18, 20};
		int b[] = {7, 11, 15, 25, 28, 30, 35};
		int res[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length)
		{
			if (a[i] < b[j])
			{
				res[k] = a[i];
				k++;
				i++;
			}
			else
			{
				res[k] = b[j];
				k++;
				j++;
			}
		}
		while (i < a.length)
		{
			res[k] = a[i];
			k++;
			i++;
		}
		while (j < b.length)
		{
			res[k] = b[j];
			k++;
			j++;
		}
		for (i = 0; i < res.length; i++)
			System.out.print(res[i] + "  ");
	}
}