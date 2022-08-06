import java.util.*;
class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(performKadane(a, n));
    }
    static int performKadane(int a[], int n) {
        int i = 0;
        int currentSum = 0;
        int maxSum = 0;
        while (i < n) {
            currentSum = currentSum + a[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
            i++;
        }
        return maxSum;
    }
}