package Assignments.Strings;
// https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
public class E_20 {
    public static void main(String[] args) {
        String s = "10";
        boolean ans = checkOnesSegment(s);
        System.out.println(ans);
    }
    static boolean checkOnesSegment(String s) {
        return !s.contains("01");
        /*
        the constraint that allows this solution is "Given a binary string s without leading zeros" or s[0] is '1'.

Since we know that s[0] == '1', a string with only one segment of '1's will always have all the '1's at the beginning of 
the string before any '0's occur. (ie, "111000", "110", "1", etc.)

Because of this constraint we know that if we find a '0' followed by a '1' that at minimum we have the leading segment of 
'1's followed by at least one '0' followed by a '1' creating at least two segments of '1's.

If the constraint was removed this approach would not work as the "01" substring could now be found at the beginning, 
although it would be simple enough to trim the leading '0's and do the same thing to the substring.
         */
    }
}
