package Assignments.Strings;
// https://leetcode.com/problems/roman-to-integer/
public class E_23 {
    public static void main(String[] args) {
        String s = "XIV";
        int count = 0;  

        for (int i = 0; i < s.length()-1; i++) {
            int start = s.charAt(i);  int end = s.charAt(i+1);
            if(s.charAt(start) == 'I' && s.charAt(end) == 'v'){
                
                }else if(s.charAt(start) == 'I' && s.charAt(end) == 'V'){

                }else if(s.charAt(start) == 'I' && s.charAt(end) == 'X'){

                }else if(s.charAt(start) == 'X' && s.charAt(end) == 'L'){

                }else if(s.charAt(start) == 'X' && s.charAt(end) == 'C'){

                }else if(s.charAt(start) == 'C' && s.charAt(end) == 'v'){

            }
        }
    }
}
