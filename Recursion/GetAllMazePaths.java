import java.util.*;
class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        getPath(0, 0, new ArrayList<String>(), m, n);
    }
    static void getPath(int m, int n, ArrayList<String> psf, int row, int col) {
        if (m == row - 1 && n == col - 1) {
            System.out.println(psf);
            return;
        }
        if (m >= row || n >= col) {
            return;
        }
        psf.add("h");
        getPath(m, n + 1, psf, row, col);
        psf.remove(psf.size() - 1);
        psf.add("v");
        getPath(m + 1, n, psf, row, col);
        psf.remove(psf.size() - 1);
    }
}