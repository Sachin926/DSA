import java.util.*;
class getMaze
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(getMaze(1, 1, m, n));
	}
	static ArrayList<String> getMaze(int r, int c, int m, int n)
	{
		ArrayList<String> temp = new ArrayList<String>();
		if (r == m && c == n)
		{
			temp.add("");
			return temp;
		}
		ArrayList<String> listH = new ArrayList<String>();
		ArrayList<String> listV = new ArrayList<String>();
		if (r < m)
			listH = getMaze(r + 1, c, m, n);
		if (c < n)
			listV = getMaze(r, c + 1, m, n);
		ArrayList<String> paths = new ArrayList<String>();
		for (int i = 0; i < listV.size(); i++)
			paths.add("v" + listV.get(i));
		for (int i = 0; i < listH.size(); i++)
			paths.add("h" + listH.get(i));
		return paths;
	}
}
