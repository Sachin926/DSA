import java.util.*;
class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(findIntersection(a, b));
    }
    static HashSet<Integer> findIntersection(int a[], int b[]) {
        int i = 0;
        int j = 0;
        int n = a.length;
        int m = b.length;
        HashSet<Integer> set = new HashSet<>();
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                set.add(a[i]);
                i++;
                j++;
            }
            else {
                if (a[i] < b[j]) {
                    i++;
                }
                else {
                    j++;
                }
            }
        }
        return set;
    }
}