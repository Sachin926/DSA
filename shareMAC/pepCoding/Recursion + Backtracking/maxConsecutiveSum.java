import java.util.*;
class maxConsecutiveSum
{
    static int last;
    static HashMap<Integer, Integer> memo = new HashMap<>();
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = {-1, -2, -3, -4};
        last = -1;
        int n = a.length;
        System.out.println(maxSubArray(a, n));
    }
    static int maxSubArray(int a[], int n)
    {
        if (memo.containsKey(n))
            return memo.get(n);
        if (n == 1)
        {
            last = n;
            return a[n - 1];
        }
        int sum = maxSubArray(a, n - 1);
        if (last == n - 1)
        {
            last = n;
            if (sum + a[n - 1] > sum)
            {
                memo.put(n, sum + a[n - 1]);
                return sum + a[n - 1];
            }
            else
            {
                memo.put(n, sum);
                return sum;
            }
        }
        else
        {
            memo.put(n, sum);
            return sum;
        }
    }
}