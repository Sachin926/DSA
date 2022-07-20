// { Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Isomorphic Strings {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}
// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s1,String s2)
    {
        // Your code here
        if (s1.length() != s2.length()){
			//System.out.println("NOT");
			return false;
		}
		int n = s1.length();
		HashMap<Character, Character> map1 = new HashMap<>();
		HashMap<Character, Boolean> map2 = new HashMap<>();
		for (int i = 0; i < n; i++){
			if (map1.containsKey(s1.charAt(i))){
				if (map1.get(s1.charAt(i)) != s2.charAt(i)){
					//System.out.println("NOT");
					return false;
				}
			}
			else{
				map1.put(s1.charAt(i), s2.charAt(i));
				if (map2.containsKey(s2.charAt(i))){
					//System.out.println("NOT");
					return false;
				}
				map2.put(s2.charAt(i), true);
			}
		}
		return true;
    }
}