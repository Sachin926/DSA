import java.util.*;
class mergeSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int arr[] = mergeSort(a, n - 1, 0);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "  ");
    }
    static int[] mergeArray(int a[], int b[])
    {
        int res[] = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length)
        {
            if (a[i] < b[j])
            {
                res[k] = a[i];
                k++;
                i++;
            }
            else
            {
                res[k] = b[j];
                k++;
                j++;
            }
        }
        while (i < a.length)
        {
            res[k] = a[i];
            k++;
            i++;
        }
        while (j < b.length)
        {
            res[k] = b[j];
            k++;
            j++;
        }
        return res;
    }
    static int[] mergeSort(int arr[], int hi, int lo)
    {
        int res[] = new int[1];
        if (lo == hi)
        {
            res[0] = arr[hi];
            return res;
        }
        int mid = (hi + lo) / 2;
        int a[] = mergeSort(arr, hi, mid + 1);
        int b[] = mergeSort(arr, mid, lo);
        return mergeArray(a, b);
    }
}