import java.util.*;
class getMazePathJumps
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(getMazePathJumps(1, 1, m, n));
	}
	public static ArrayList getMazePathJumps(int r, int c, int m, int n)
	{
		ArrayList <String> temp = new ArrayList<String>();
		if (r == m && c == n)
		{
			temp.add("");
			return temp;
		}
		ArrayList<String> paths = new ArrayList<String>();
		for (int h = 1; h <= n - c; h++)
		{
			ArrayList<String> hpaths = getMazePathJumps(r, c + h, m, n);
			for (int i = 0; i < hpaths.size(); i++)
				paths.add("h" + h + hpaths.get(i));
		}
		for (int v = 1; v <= m - r; v++)
		{
			ArrayList<String> vpaths = getMazePathJumps(r + v, c, m, n);
			for (int i = 0; i < vpaths.size(); i++)
				paths.add("v" + v + vpaths.get(i));
		}
		for (int d = 1; d <= n - c && d <= m - r; d++)
		{
			ArrayList<String> dpaths = getMazePathJumps(r + d, c + d, m, n);
			for (int i = 0; i < dpaths.size(); i++)
				paths.add("d" + d + dpaths.get(i));
		}
		return paths;
	}
}