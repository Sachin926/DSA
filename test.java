import java.util.*;
class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int res[] = sortArray012(a, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static int[] sortArray012(int a[], int n) {
        int i = 0;
        int j = 0;
        int k = n - 1;
        while (k >= j) {
            if (a[j] == 1) {
                j++;
            }
            else if (a[j] == 0) {
                swap(a, i, j);
                i++;
                j++;
            }
            else {
                swap(a, j, k);
                k--;
            }
        }
        return a;
    }
    static void swap(int a[], int l, int m) {
        int temp = a[l];
        a[l] = a[m];
        a[m] = temp;
    }
}