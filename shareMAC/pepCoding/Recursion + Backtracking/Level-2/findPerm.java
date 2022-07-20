import java.util.*;
class test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int a[] = new int[n];
        Arrays.fill(a, 0);
        count = 0;
        getCombination(a, n, r);
        System.out.println(count);
    }
    static int count = 0;
    static void getCombination(int a[], int n, int r) {
        if (r == 0) {
            count++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                a[i] = r;
                getCombination(a, n, r - 1);
                a[i] = 0;
            }
        }
    }
}