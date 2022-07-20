import java.util.*;
class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int a[] = new int[r];
        for (int i = 0; i < r; i++) {
            a[i] = i + 1;
        }
        printPerm(n, a, "", n, r);
    }
    static void printPerm(int r, int a[], String res, int n, int m) {
        if (r == 0) {
            if (isValid(res, n, m)) {
                System.out.println(res);
            }
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                int val = a[i];
                a[i] = 0;
                printPerm(r - 1, a, res + val, n, m);
                a[i] = val;
            }
        }
        printPerm(r - 1, a, res + 0, n, m);
    }
    static boolean isValid(String s, int n, int r) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                count++;
            }
        }
        if (count == n - r) {
            return true;
        }
        else {
            return false;
        }
    }
}