package Assignments.Strings;
// https://leetcode.com/problems/merge-strings-alternately/
public class E_21 {
    public static void main(String[] args) {
        String word1 = "ab"; String word2 = "pqrs"; String maxString;
        int limit = Math.min(word1.length(), word2.length());
        int max = Math.max(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();

        if(max > word1.length()){
            maxString = word2;
        } else{
            maxString = word1;
        }

        for (int i = 0; i <= limit; i++) {
            if(i== limit){
                for (int j = limit; j < max; j++) {
                    sb.append(maxString. charAt(j));
                }
            }else{
                sb.append(word1. charAt(i));
                sb.append(word2. charAt(i));
            }
            
        }
        
        System.out.println(sb);
    }
}
