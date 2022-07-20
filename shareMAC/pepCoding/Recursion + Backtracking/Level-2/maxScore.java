import java.util.*;
class maxScore
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		String words[] = new String[n];
		for (int i = 0; i < words.length(); i++)
			words[i] = sc.nextInt();
		int m = sc.nextInt();
		char letters[] = new char[m];
		for (int i = 0; i < m; i++)
			letters[i] = sc.next().charAt(0);
		int score[] = new int[26];
		for (int i = 0; i < score.length; i++)
			score[i] = sc.nextInt();
		int freq[] = new int[26];
		for (int i = 0; i < m; i++)
			freq[letters[i] - 'a']++;
	}
	static int solution(String words[], int freq[], int score[], int n)
	{
		if (n == words.length)
			return 0;
		int no = solution(words, freq, score, n + 1);
		int yes = 0;
		boolean flag = true;
		int current = 0;
		for (int i = 0; i < words[n].length(); i++)
		{
			if (freq[words[n].charAt(i) - 'a'] == 0)
			{
				flag = false;
			}
			else
			{
				freq[words[n].charAt(i) - 'a']--;
				current = current + score[words[n].charAt(i) - 'a'];
			}
		}
		if (flag)
		{
			yes = current + solution(words, freq, score, n - 1);
		}
		for (int i = 0; i < words[n].length(); i++)
		{
			freq[words[n].charAt(i) - 'a']++;
		}
		return Math.max(yes, no);
	}
}
