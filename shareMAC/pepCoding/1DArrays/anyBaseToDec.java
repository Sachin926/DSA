import java.util.*;
class anyBaseToDec
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		double sum = 0;
		for (int i = n, k = 0; i > 0; i = i / 10, k++)
		{
			sum = sum + (i % 10) * Math.pow(b, k);
		}
		System.out.println(sum);
	}
}