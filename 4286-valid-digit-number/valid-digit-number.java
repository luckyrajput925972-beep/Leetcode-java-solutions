
class Solution {
    public boolean validDigit(int n, int x) {
        String s = String.valueOf(n);
        char ch = (char) ('0' + x);

        if (s.charAt(0) == ch) {
            return false;
        }

        if (s.indexOf(ch) != -1) {
            return true;
        }

        return false;
    }
}
