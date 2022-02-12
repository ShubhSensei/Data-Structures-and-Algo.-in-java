package Assignments.Strings;

// https://leetcode.com/problems/reverse-prefix-of-word/
public class E_22 {
    public static void main(String[] args) {
        String reverse = "abcdefg ";
        char ch = 'e';
         
        StringBuilder ans = new StringBuilder();
        int k = 0;
        while(k < reverse.length()){
            if(ch != reverse.charAt(k)){
                k++;
            } else if(ch != reverse.charAt(k) && k == reverse.length()-1){
                break;
            } else{
                continue;
            }
        }
        for (int i = 0; i < reverse.length(); i++) {
            if(reverse. charAt(i) == ch){
                for (int j = i; j >= 0; j--) {
                    ans.append(reverse. charAt(j));
                }
                for (int j = i+1; j < reverse.length(); j++) {
                    ans.append(reverse. charAt(j));
                }
            }
        } 
        System.out.println(ans);
    }
}
