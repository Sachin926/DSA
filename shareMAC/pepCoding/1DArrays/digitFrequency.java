import java.util.*;
class digitFrequency
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int sum = 0;
		while (n > 0)
		{
			if (n % 10 == d)
				sum += 1;
			n = n / 10;
		}
		System.out.println(sum);
	}
}