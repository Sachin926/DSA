import java.util.*;
class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = -1;
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                k = i;
                break;
            }
            if (a[i] < max) {
                continue;
            }
        }
        System.out.println(k);
    }
}