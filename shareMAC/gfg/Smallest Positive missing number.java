// { Driver Code Starts
import java.util.*;

class Main
{   
    
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            int missing = new Solution().findMissing(arr,n);
            
            System.out.println(missing);
        }
    }
}// } Driver Code Ends




class Solution{
    
    // Function to find 
    static int findMissing(int a[], int n)
    {
       
       // Your code here
       int i = 0;
       int j = 0;
       while (i < n)
       {
           if (a[i] > 0)
           {
               swap(a, i, j);
               j++;
               i++;
           }
           else
           {
               i++;
           }
       }
       for (i = 0; i < j; i++)
       {
           int x = Math.abs(a[i]);
           if (x - 1 < n && a[x - 1] > 0)
           {
               a[x - 1] = -1 * a[x - 1];
           }
       }
       for (i = 0; i < j; i++)
       {
           if (a[i] > 0)
           {
               return i + 1;
           }
       }
       return i + 1;
    }
    static void swap(int a[], int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}