import java.util.*;
class keypadComb
{
	static String[] keypad = {"?!", "abc", "def", "ghi", "jkl", "mnop", "qrst", "uv", "wxyz", ".,"};
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println(keypadCombination(a));
	}
	static ArrayList<String> keypadCombination(int a[])
	{
		ArrayList<String> temp = new ArrayList<>();
		if (a.length == 0)
		{
			temp.add("");
			return temp;
		}
		else
		{
			int b[] = Arrays.copyOfRange(a, 1, a.length);
			ArrayList<String> list = keypadCombination(b);
			ArrayList<String> li = new ArrayList<String>();
			String comb = keypad[a[0]];
			for (int i = 0; i < comb.length(); i++)
			{
				char ch = comb.charAt(i);
				for (int j = 0; j < list.size(); j++)
				{
					li.add(ch + list.get(j));
				}
			}
			return li;
		}
	}
}
