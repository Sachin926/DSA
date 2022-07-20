import java.util.*;
class GetAllJumpPaths {
    static int[] a = {1, 2, 3};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getAllJumps(n, new ArrayList<Integer>());
    }
    static void getAllJumps(int n, ArrayList<Integer> rsf) {
        if (n == 0) {
            System.out.println(rsf);
            return;
        }
        if (n < 0) {
            return;
        }
        for (int i = 0; i < 3; i++) {
            rsf.add(a[i]);
            getAllJumps(n - a[i], rsf);
            rsf.remove(rsf.size() - 1);
        }
    }
}