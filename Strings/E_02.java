// import java.util.*;
public class E_02 {
    public static void main(String[] args) {
        int[] indices = {4,5,6,7,0,2,1,3};
        String s = "codeleet";
        char[] sbaby = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sbaby[i] = ch;
        }
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices.length-1-i; j++) {
                if(indices[j] > indices[j+1]){
                    int temp = indices[j];
                    indices[j] = indices[j+1];
                    indices[j+1] = temp;

                    char champ = sbaby[j];
                    sbaby[j] = sbaby[j+1];
                    sbaby[j+1] = champ;
                }
            }
        }
        String str = String.copyValueOf(sbaby);
        System.out.println(str);
    }
}
