import java.util.*;
class test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String temp_a, temp_b;
		Stack<Integer> sta = new Stack<>();
		Stack<Integer> stb = new Stack<>();
		Stack<Integer> stc = new Stack<>();
		sta.push(0);
		stb.push(0);
		if (a.length() >= b.length())
		{
			temp_a = a;
			temp_b = b;
		}
		else
		{
			temp_a = b;
			temp_b = a;
		}
		for (int i = 1; i <= temp_a.length() - temp_b.length(); i++)
		{
			stb.push(0);
		}
		for (int i = 0; i < temp_a.length(); i++)
		{
			sta.push(Integer.parseInt("" + temp_a.charAt(i)));
		}
		for (int i = 0; i < temp_b.length(); i++)
		{
			stb.push(Integer.parseInt("" + temp_b.charAt(i)));
		}
		System.out.println(sta);
		System.out.println(stb);
		for (int i = 0; i < temp_a.length(); i++)
		{
			int aa = sta.pop();
			int bb = stb.pop();
			int c = aa + bb;
			if (c > 9)
			{
				if (sta.size() == 1)
				{
					stc.push(c % 10);
					stc.push(1);
				}
				int carry = c / 10;
				stc.push(c % 10);
				int back = sta.pop() + 1;
				sta.push(back);
			}
			if (c <= 9)
				stc.push(c);
		}
		System.out.println(stc);
	}
}