import java.util.*;
class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(minimiseTheMaxDifference(a, n, k));
    }
    static int minimiseTheMaxDifference(int a[], int n, int k) {
        Arrays.sort(a);
        int minDiff = a[n - 1] - a[0];
        for (int i = 1; i < n; i++) {
            int max = Math.max(a[i] - k, a[n - 1] - k);
            int min = Math.min(a[i - 1] + k, a[0] + k);
            minDiff = Math.min(minDiff, max - min);
        } 
        return minDiff;
    }
}