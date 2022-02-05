package Assignments.Strings;
// https://leetcode.com/problems/to-lower-case/
public class E_07 {
    public static void main(String[] args) {
        String s = "HELLO";
        String ans = toLowerCase(s);
        System.out.println(ans);
    }
    static String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.toLowerCase(). charAt(i);
            ans.append(ch);
        }
        return ans.toString();
    }
}
