package Assignments.Strings;
// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class E_12 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        char[] ch = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        for (int i = ch.length-1; i >= 0; i--) {
            ans.append(ch[i]);
        }
        System.out.println(ans.toString());
    }
}
