import java.util.*;
class twoPointerAlgo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (a[i] + a[j] > 0)
                    break;
                else if (a[i] + a[j] == 0)
                {
                    System.out.println("YES");
                    return;
                }
                else
                    continue;
            }
        }
        System.out.println("NO");
    }
}