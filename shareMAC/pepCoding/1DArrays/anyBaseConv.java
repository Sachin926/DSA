import java.util.*;
class anyBaseConv
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int r = 0;
		for (int i = n; i > 0; i = i / b)
		{
			r = r * 10 + i % b;
		}
		System.out.println(r);
		System.out.println(anyBase(n, b, 0));
	}
	//recursion
	static int anyBase(int n, int b, int r)
	{
		if (n == 0)
			return r;
		return anyBase(n / b, b, r * 10 + n % b);
	}
}