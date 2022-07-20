import java.util.*;
class anyBaseSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int base = sc.nextInt();
		double r = 0;
		int k = 0;
		int sum = 0, carry = 0 ;
		while (a > 0 && b > 0)
		{
			sum = a % 10 + b % 10;
			carry = sum / base;
			sum = sum % base;
			r = r + sum * Math.pow(10, k);
			k++;
			a = a / 10;
			a = a + carry;
			b = b / 10;
		}
		r = r + carry * Math.pow(10, k);
		System.out.println(r);
	}
}