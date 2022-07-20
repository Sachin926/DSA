import java.util.*;
class inverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int b[] = new int[n];
		for (int i = 0; i < n; i++)
			b[a[i]] = i;
		for (int i = 0; i < n; i++)
			System.out.print(b[i] + ", ");
	}
}