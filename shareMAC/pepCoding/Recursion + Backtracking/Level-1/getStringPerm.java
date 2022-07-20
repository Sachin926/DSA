import java.util.*;
class getStringPerm
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(getPerm(s));
	}
	static ArrayList<String> getPerm(String s)
	{
		if (s.equals(""))
		{
			ArrayList<String> temp = new ArrayList<String>();
			temp.add("");
			return temp;
		}
		else
		{
			ArrayList<String> res = new ArrayList<String>();
			for (int i = 0; i < s.length(); i++)
			{
				char ch = s.charAt(i);
				String perm = s.substring(0, i) + s.substring(i + 1);
				ArrayList<String> list = getPerm(perm);
				for (int j = 0; j < list.size(); j++)
				{
					res.add(ch + list.get(j));
				}
			}
			return res;
		}
	}
}