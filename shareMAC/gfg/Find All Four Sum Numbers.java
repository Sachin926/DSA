// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] a, int k) {
        // code here
        int n = a.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(a);
        int ind = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                int sum = k - (a[i] + a[j]);
                {
                    int start = j + 1;
                    int end = n - 1;
                    while (end > start)
                    {
                        if (a[start] + a[end] == sum)
                        {
                            res.add(new ArrayList<Integer>());
                            res.get(ind).add(a[i]);
                            res.get(ind).add(a[j]);
                            res.get(ind).add(a[start]);
                            res.get(ind).add(a[end]);
                            ind++;
                            
                            //remove dup
                            while (start < end && a[start] == res.get(ind - 1).get(2)) start++;
                            while (start < end && a[end] == res.get(ind - 1).get(3)) end--;
                        }
                        else if(a[start] + a[end] < sum)
                        {
                            start++;    
                        }
                        else
                        {
                            end--;
                        }
                    }
                    
                }
                //remove dup
                while (j + 1 < n && a[j + 1] == a[j]) j++;
                
            }
            //remove dup
            while (i + 1 < n && a[i + 1] == a[i]) i++;
        }
        return res;
    }
}