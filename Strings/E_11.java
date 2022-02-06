package Assignments.Strings;
//https://leetcode.com/problems/robot-return-to-origin/
public class E_11 {
    public static void main(String[] args) {
        String moves = "RRDD";
        int countU = 0;
        int countR = 0;
        for (int i = 0; i < moves.length(); i++) {
            char ch = moves. charAt(i);
            if(ch == 'U'){
                countU++;
            } else if(ch == 'D'){
                countU--;
            } 
            else if(ch == 'R'){
                countR++;
            }else if(ch == 'L'){
                countR--;
            }
            else{
                System.out.println("Enter only U, D, R, L");
            }
        }
        if(countU == 0 && countR == 0){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
