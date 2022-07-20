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
        System.out.println("K'th largest elemnt is ->" + getKthElement(a, k));
    }
    static int getKthElement(int a[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < a.length; i++) {
            if (pq.size() == k) {
                pq.remove();
                pq.add(a[i]);
            }
            else {
                pq.add(a[i]);
            }
        }
        return pq.remove();
    }
}