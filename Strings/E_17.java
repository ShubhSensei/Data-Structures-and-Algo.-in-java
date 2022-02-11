package Assignments.Strings;
// https://leetcode.com/problems/valid-palindrome-ii/
public class E_17 {
    public static void main(String[] args) {
        String s = "aba";
        boolean ans = validPalindrome(s);
        System.out.println(ans);
    }
    static boolean validPalindrome(String s) {
        char[] ch = s. toCharArray();
        int start = ch[0];
        int end = ch[s.length()-1];
        if(s.length()%2!=0){
            palindrome(start, end);
        } else{
            int mid = s.length()/2;
            // List&lt;Integer&gt;arrayList = IntStream.of(myArray) .boxed().collect(Collectors.toList());
            return true;
        }
        return true;
    }
    static boolean palindrome(int start, int end){
        while(start<end){
            if(start == end){
                start++;
                end--;
            } else{
                return false;
            }
        }
        return true;
    }
}