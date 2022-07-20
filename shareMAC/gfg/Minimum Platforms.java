// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int a[], int d[], int n)
    {
        // add your code here
        Arrays.sort(a);
        Arrays.sort(d);
        int i = 1;
        int j = 0;
        int maxPlat = 1;
        int curPlat = 1;
        while (i < n && j < n)
        {
            if (a[i] <= d[j])
            {
                curPlat = curPlat + 1;
                i++;
            }
            else if(a[i] > d[j])
            {
                curPlat = curPlat - 1;
                j++;
            }
            if (curPlat > maxPlat)
            {
                maxPlat = curPlat;
            }
        }
        return maxPlat;
    }
    
}

