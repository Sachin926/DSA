import java.util.*;
class test {
    static int[] a = {1, 2, 3};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<String> res = getPath(0, 0, m, n);
        System.out.println("THE PATH IS ->" + res);
    }
    static ArrayList<String> getPath(int m, int n, int row, int col) {
        if (m == row - 1 && n == col - 1) {
            ArrayList<String> t = new ArrayList<>();
            t.add("");
            return t;
        }
        if (m >= row || n >= col) {
            return new ArrayList<String>();
        }
        ArrayList<String> temp = new ArrayList<>();
        temp.add("h");
        temp.addAll(getPath(m, n + 1, row, col));
        if (temp.size() > 1) {
            return temp;
        }
        else {
            temp.remove(temp.size() - 1);
            temp.add("v");
            temp.addAll(getPath(m + 1, n, row, col));
            return temp;
        }

    }
}