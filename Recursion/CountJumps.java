import java.util.*;
class CountJumps {
    static int count = 0;
    static int[] a = {1, 2, 3};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getJumps(n);
        System.out.println("All possible jumps are -> " + count);
    }
    static void getJumps(int n) {
        if (n == 0) {
            count++;
            return;
        }
        if (n < 0) {
            return;
        }
        for (int i = 0; i < 3; i++) {
            getJumps(n - a[i]);
        }
    }
}