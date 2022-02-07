package Assignments.Strings;
// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class E_12 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        char[] ch = s.toCharArray();
        // for (int i = 0; i < ch.length; i++) {
        //     for (int j = 0; j < ch.length; j++) {
        //         if(ch[j] == ' ' || j == ch.length-1){
        //             int start = 0;  int end = j-1;
        //             if(j == ch.length){
        //                 end = j;
        //             }
        //             while(start>end){
        //                 char temp = ch[start];
        //                 ch[start] = ch[end];
        //                 ch[end] = temp;
        //                 end--;
        //                 start++;
        //             } 
        //         }
        //         i = j;
        //     }
            
        // }
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println(s);
        // System.out.println(ch.toString());
    }
}