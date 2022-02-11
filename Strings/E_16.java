package Assignments.Strings;
// https://leetcode.com/problems/valid-palindrome/
public class E_16 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String ans = s.replaceAll("[^a-zA-Z0-9]", ""). toLowerCase();
        String reverse = "";
        for (int i = ans.length()-1; i >= 0; i--) {
            reverse = reverse + ans. charAt(i);
        }
        if(reverse.equals(ans)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
