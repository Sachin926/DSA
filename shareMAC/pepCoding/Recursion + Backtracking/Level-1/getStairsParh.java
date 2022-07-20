import java.util.*;
class getStairsParh
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getStairPath(n));
	}
	static ArrayList<String> getStairPath(int n)
	{
		ArrayList<String> temp = new ArrayList<String>();
		if (n < 0)
		{
			return temp;
		}
		if (n == 0)
		{
			temp.add("");
			return temp;
		}
		else
		{
			ArrayList<String> p1 = getStairPath(n - 1);
			ArrayList<String> p2 = getStairPath(n - 2);
			ArrayList<String> p3 = getStairPath(n - 3);
			ArrayList<String> paths = new ArrayList<>();
			for (int i = 0; i < p1.size(); i++)
				paths.add(1 + p1.get(i));
			for (int i = 0; i < p2.size(); i++)
				paths.add(2 + p2.get(i));
			for (int i = 0; i < p3.size(); i++)
				paths.add(3 + p3.get(i));
			return paths;
		}
	}
}
