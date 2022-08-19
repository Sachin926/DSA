import java.util.*;
class test {
	static String moves  = "tldr";
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int maze[][] = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				maze[i][j] = sc.nextInt();
		int visited  = new int[n][m];
		for (int i = 0; i < n; i++)
			Arrays.fill(visited[i], 0);
		visited[0][0] = 1;
		floodFill(maze, 0, 0, visited, "");
	}
	static boolean isValid(int maze[][], int i, int j, int visited[][]) {
		if (i < 0 || j < 0 || i >= maze.length || j >= maze[0].length || visited[i][j] == 1) {
			return false;
		}
		return true;
	}
	static void floodFill(int maze[][], int row, int col, int visited[][], String res) {
		for (int i = 0; i < s.length; i++) {
			switch (s.charAt(i)) {
			case 't':
				if (isValidMove(maze, row - 1, col, visited)) {
					visited[row - 1][col] = 1;
					floodFill(maze, row - 1, col, visited, res + 't');
					visited[row - 1][col] = 0;
				}
				break;
			case 'l':
				if (isValidMove(maze, row, col - 1, visited)) {
					visited[row][col - 1] = 1;
					floodFill(maze, row, col - 1, visited, res + 't');
					visited[row][col - 1] = 0;
				}
				break;
			case 'd':
				if (isValidMove(maze, row + 1, col, visited)) {
					visited[row + 1][col] = 1;
					floodFill(maze, row + 1, col, visited, res + 't');
					visited[row + 1][col] = 0;
				}
				break;
			case 'r':
				if (isValidMove(maze, row, col + 1, visited)) {
					visited[row][col + 1] = 1;
					floodFill(maze, row, col + 1, visited, res + 't');
					visited[row][col + 1] = 0;
				}
				break;
			}
		}
	}
}