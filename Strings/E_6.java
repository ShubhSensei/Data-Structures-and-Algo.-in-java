package Assignments.Strings;
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
        String aa = a.toString();
        String bb = b.toString();
        if (aa.equals(bb)){
            System.out.println(true);
        } else{
            System.err.println(false);
        }
    }
}
