import java.util.*;
class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pivot = sc.nextInt();
        partition(a, pivot);
        for (int itr = 0; itr < a.length; itr++) {
            System.out.print(a[itr] + "  ");
        }
        System.out.println();
    }
    static void partition(int a[], int pivot) {
        int i = 0;
        int j = 0;
        while (j < a.length) {
            if (a[j] > 5) {
                j++;
            }
            else {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
                j++;
            }
        }
    }
}