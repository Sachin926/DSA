import java.util.*;
class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maze[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(maze[i], 0);
		}
		getMazePath(n, 0, maze);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}
	}
	static void getMazePath(int n, int row, int maze[][]) {
		if (row == n - 1) {
			maze[row][n - 1] = 1;
			return;
		}
		if (row >= n) {
			return;
		}
		for (int i = 0; i < n; i++) {
			if (isSafeRow(row, i, maze) && isSafeDiagnol(row, i, maze)) {
				maze[row][i] = 1;
				row += 1;
				getMazePath(n, row, maze);
				row -= 1;
				maze[row][i] = 0;
			}
		}
	}
	static boolean isSafeRow(int i, int j, int maze[][]) {
		while (i >= 0) {
			if (maze[i][j] == 1) {
				return false;
			}
			i--;
		}
		return true;
	}
	static boolean isSafeDiagnol(int row, int col, int maze[][]) {
		int i = row;
		int j = col;
		while (i >= 0 && j >= 0) {
			if (maze[i][j] == 1) {
				return false;
			}
			i--;
			j--;
		}
		while (row >= 0 && col < maze.length) {
			if (maze[row][col] == 1) {
				return false;
			}
			row--;
			col++;
		}
		return true;
	}
}