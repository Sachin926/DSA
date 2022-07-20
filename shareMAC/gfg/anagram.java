// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}// } Driver Code Ends




class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String s1,String s2)
    {
        
        // Your code here
        if (s1.length() != s2.length()){
			//System.out.println("NO");
			return false;
		}
		int n = s1.length();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++){
			if (map.containsKey(s1.charAt(i))){
				map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
			}
			else
				map.put(s1.charAt(i), 1);
		}
		for (int i = 0; i < n; i++){
			if (map.containsKey(s2.charAt(i))){
				map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
			}
			else{
				//System.out.println("NOT");
				return false;
			}
		}
		for (HashMap.Entry<Character, Integer> set : map.entrySet()){
			if (set.getValue() != 0){
				//System.out.println("NOT");
				return false;
			}
		}
		//System.out.println("YES");
		return true;
    }
}