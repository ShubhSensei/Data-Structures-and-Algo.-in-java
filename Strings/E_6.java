import java.util.*;
public class E_6 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            a.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            b.append(word2[i]);
        }
        System.out.println(a);
        System.out.println(b);
        if (a==b){
            System.out.println("true");
        } else{
            System.err.println("false");
        }
    }
    static String arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = word1.toString();
        // String b = word2.toString();
        return a;
        
    }
}
