import java.util.*;
class maxFreqOfChar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int freq[] = new int[26];
		for (int i = 0; i < s.length(); i++)
		{
			freq[s.charAt(i) - 97]++;
		}
		int max = Integer.MIN_VALUE;
		int pos = -1;
		for (int i = 0; i < freq.length; i++)
		{
			if (freq[i] > max)
			{
				max = freq[i];
				pos = i;
			}
		}
		System.out.println((char)(97 + pos));
	}
}