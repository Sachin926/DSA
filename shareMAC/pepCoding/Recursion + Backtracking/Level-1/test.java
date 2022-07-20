import java.util.*;
class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mat[][] = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		solveSudoku(0, 0, mat);
	}
	static void solveSudoku(int i, int j, int mat[][]) {
		if (j >= 9) {
			System.out.println("The Answer ->");
			for (int r = 0; r < 9; r++) {
				for (int c = 0; c < 9; c++) {
					System.out.print(mat[r][c] + " ");
				}
				System.out.println();
			}
			return;
		}
		if (mat[i][j] == 0) {
			for (int k = 1; k <= 9; k++) {
				if ((inRow(i, k, mat) || inCol(j, k, mat) || inSubMat(i, j, k, mat)) == false) {
					mat[i][j] = k;
					if (i + 1 >= 9) {
						solveSudoku(0, j + 1, mat);
					}
					else {
						solveSudoku(i + 1, j, mat);
					}
					mat[i][j] = 0;
				}
			}
		}
		else {
			if (i + 1 >= 9) {
				solveSudoku(0, j + 1, mat);
			}
			else {
				solveSudoku(i + 1, j, mat);
			}
		}
	}
	static boolean inSubMat(int r, int c, int k, int mat[][]) {
		int row = (r / 3) * 3;
		int col = (c / 3) * 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (mat[i + row][j + col] == k) {
					return true;
				}
			}
		}
		return false;
	}
	static boolean inRow(int i, int k, int mat[][]) {
		for (int j = 0; j < 9; j++) {
			if (mat[i][j] == k) {
				return true;
			}
		}
		return false;
	}
}