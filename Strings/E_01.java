// package Assignments.Strings;
// https://leetcode.com/problems/defanging-an-ip-address/
public class E_01 {
    public static void main(String[] args) {
        String s = ".";
        String address = "255.100.50.0";
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < address.length(); i++) { 
            char ch = address.charAt(i);
             if(ch == '.'){
                 s = "[.]";
                 a.append(s);
             } else{
                a.append(ch);
             }
        }
        System.out.print(a);        
    }
}
                        /*In Function, STring builder can be returned by using the method "return Var_name.toString();"
                     Eg.-  In this case 
                            a.toString(); */
