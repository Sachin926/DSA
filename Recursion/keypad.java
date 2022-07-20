import java.util.*;
class keypad {
    static String[] keypad = {".", "*#", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(getKeypadComb(a, 0));
    }
    static ArrayList<String> getKeypadComb(int a[], int n) {
        if (n == a.length - 1) {
            ArrayList<String> t = new ArrayList<>();
            for (int i = 0; i < keypad[a[n]].length(); i++) {
                t.add("" + keypad[a[n]].charAt(i));
            }
            return t;
        }
        String s = keypad[a[n]];
        ArrayList<String> res = getKeypadComb(a, n + 1);
        ArrayList<String> temp = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < res.size(); j++) {
                temp.add(s.charAt(i) + res.get(j));
            }
        }
        return temp;
    }
}