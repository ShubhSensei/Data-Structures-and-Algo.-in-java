package Assignments;

public class M_08 {
    public static void main(String[] args) {
        
    }
    static boolean canTransform(String start, String end) {
        StringBuilder str = new StringBuilder();
        char first = ' ';
        char second = ' ';
        for (int i = 0; i < start.length()-1; i++) {
            if(start.length()%2 != 0){
                if(i == start.length() - 3){
                    first = start.charAt(i);
                    second = start.charAt(i+1);
                    if(first == 'X' && second == 'L'){
                        str.append("LX");
                        str.append(start.charAt(i+2));
                        if(str.toString() == end){
                            return true;
                        } else{
                            return false;
                        }
                    } else if( first == 'R' && second == 'X') {
                        str.append("XR");
                    } else{
                        return false;
                    }
                }
            } else{
                first = start.charAt(i);
                second = start.charAt(i+1);
                if(first == 'X' && second == 'L'){
                    str.append("LX");
                } else if( first == 'R' && second == 'X') {
                    str.append("XR");
                } else{
                    return false;
                }
            }
        }

        if(str.toString() == end){
            return true;
        } else{
            return false;
        }
    }
    // static StringBuilder swap(StringBuilder str, char first, char second){

    //     return null;
        
    // }
}
