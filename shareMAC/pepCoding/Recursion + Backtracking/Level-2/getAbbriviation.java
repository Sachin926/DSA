import java.util.*;
class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> res = getAbbriviation(s);
        System.out.println(res);
    }
    static ArrayList<String> getAbbriviation(String s) {
        if (s.equals("")) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        char ch = s.charAt(0);
        ArrayList<String> res = getAbbriviation(s.substring(1));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < res.size(); i++) {
            list.add(ch + res.get(i));
        }
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i).length() > 0) {
                if (Character.isDigit((res.get(i).charAt(0)))) {
                    list.add("" + (Integer.parseInt("" + res.get(i).charAt(0)) + 1));
                }
                else {
                    list.add(1 + res.get(i));
                }
            }
            else {
                list.add(1 + res.get(i));
            }
        }
        return list;
    }
}