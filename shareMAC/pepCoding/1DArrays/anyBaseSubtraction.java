import java.util.*;
class anyBaseSubtraction
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int base = sc.nextInt();
		int k = 0;
		double res = 0;
		while (a > 0 && b > 0)
		{
			if (a % 10 >= b % 10)
			{
				int diff = a % 10 - b % 10;
				res = res + diff * Math.pow(10, k);
				k++;
			}
			else
			{
				int diff = a % 10 + base - b % 10;
				a = a / 10 - 1;
				b = b / 10;
				res = res + diff * Math.pow(10, k);
				k++;
			}
		}
		System.out.println(res);
	}
}