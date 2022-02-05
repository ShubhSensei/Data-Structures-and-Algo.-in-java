package Assignments.Strings;
// https://leetcode.com/problems/determine-if-string-halves-are-alike/
public class E_08 {
    public static void main(String[] args) {
        String s = "book";
        boolean ans = halvesAreAlike(s);
        System.out.println(ans);
    }
    static boolean halvesAreAlike(String s) {
        int counta = 0;
        int countb = 0;
        for (int i = (int) ((s.length()-1)/2); i >= 0; i--) {
            char ch = s. charAt(i);
            if(ch == 'a' || ch =='e'|| ch == 'i' || ch =='o'|| ch =='u'||ch == 'A'||ch == 'E'|| ch =='I'|| ch =='O'||ch == 'U'){
                counta++;
            }
        }
        for (int i = (int) (((s.length()-1)/2)+1); i < s.length(); i++) {
            char ch = s. charAt(i);
            if(ch == 'a' || ch =='e'|| ch == 'i' || ch =='o'|| ch =='u'||ch == 'A'||ch == 'E'|| ch =='I'|| ch =='O'||ch == 'U'){
                countb++;
            }
        }
        if(counta == countb){
            return true;
        } else{
            return false;
        }
    }
}
