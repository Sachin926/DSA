import java.util.*;
class printSubSeq
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(getSubSeq(s));
	}
	static ArrayList<String> getSubSeq(String s)
	{
		ArrayList<String> temp = new ArrayList<>();
		if (s.length() == 0)
		{
			temp.add("");
			return temp;
		}
		char ch = s.charAt(0);
		ArrayList<String> list = getSubSeq(s.substring(1));
		ArrayList<String> li = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++)
		{
			li.add(ch + list.get(i));
		}
		list.addAll(li);
		return list;
	}
}
