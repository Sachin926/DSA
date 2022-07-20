import java.util.*;
class minSwapsToSort
{
    static class Pair implements Comparable<Pair>
    {
        int ind;
        int val;
        Pair(int val, int ind)
        {
            this.ind = ind;
            this.val = val;
        }
        @Override
        public int compareTo(Pair o)
        {
            return this.val - o.val;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++)
        {
            pairs[i] = new Pair(a[i], i);
        }
        Arrays.sort(pairs);
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            visited[i] = true;
            Pair temp = pairs[i];
            int k = temp.ind;
            int sum = 0;
            while (k != i && visited[k] == false)
            {
                visited[k] = true;
                temp = pairs[temp.ind];
                sum++;
                k = temp.ind;
            }
            count = count + sum;
        }
        System.out.println(count);
    }
}