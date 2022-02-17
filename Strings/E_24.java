package Assignments.Strings;
// https://leetcode.com/problems/valid-parentheses/
public class E_24 {
    public static void main(String[] args) { // Not yet completed
        String s = "()()]}";
        boolean ans = isValid(s);
        System.out.println(ans);
    }
    static boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }
        if(s.charAt(0) == '(' && s.charAt(1) == ')'){
            if(s.length() >= 2){
                for (int i = 2; i < s.length()-1; i = i+2) {
                    char start = s.charAt(i); char end = s.charAt(i+1);
                    if(start == ')' && end == '(' || start == ']' && end == '[' || start == '}' && end == '{' 
                    || start == ')' && end == '{' || start == '}' && end == '[' || start == ']' && end == '('
                    || start == '}' && end == '(' || start == '[' && end == '[' || start == '(' && end == '(' || start == '{' && end == '{'
                    || start == ')' && end == ')' || start == ']' && end == ']'  || start == '}' && end == '}'){
                        return false;
                    }
                }
            } 
            return true;
        } else{
            return false;
        }
    }
}
