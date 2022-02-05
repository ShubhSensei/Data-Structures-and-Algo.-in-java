package Assignments.Strings;
// https://leetcode.com/problems/goal-parser-interpretation/
public class E_03 {
    public static void main(String[] args) {
        String command = "G()(al)";
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            char ch = command .charAt(i);
            if(ch =='G'){
                b.append(ch);
            } else if(ch == '('){
                i++;
                ch = command .charAt(i);
                if(ch == ')'){
                    b.append('o');
                } else{
                    b.append("al");
                }
            }
        }
        System.out.println(b);
    }
}
