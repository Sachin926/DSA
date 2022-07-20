import java.util.*;
class floodFillMaze
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int maze[][] = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				maze[i][j] = sc.nextInt();
		floodFillMaze(maze, 0, 0, "", maze);
	}
	static void floodFillMaze(int maze[][], int m, int n, String res, int visited[][])
	{
		if (visited[m][n] == 1)
			return;
		if (m == maze[0].length - 1 && n == maze.length - 1)
		{
			System.out.println(res);
			return;
		}
		//t
		if (m - 1 >= 0 && maze[m - 1][n] != 1)
		{
			visited[m][n] = 1;
			floodFillMaze(maze, m - 1, n, res + "t", visited);
		}
		//l
		if (n - 1 >= 0 && maze[m][n - 1] != 1)
		{
			visited[m][n] = 1;
			floodFillMaze(maze, m, n - 1, res + "l", visited);
		}
		//d
		if (m + 1 <= maze.length - 1 && maze[m + 1][n] != 1)
		{
			visited[m][n] = 1;
			floodFillMaze(maze, m + 1, n, res + "d", visited);
		}
		//r
		if (n + 1 <= maze[0].length - 1 && maze[m][n + 1] != 1)
		{
			visited[m][n] = 1;
			floodFillMaze(maze, m, n + 1, res + "r", visited);
		}
	}
}