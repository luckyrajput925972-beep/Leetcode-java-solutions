class Solution {
    public String greatestLetter(String s) {
        for (char c = 'Z'; c >= 'A'; c--) {
            char small = (char)(c + 32);
            if (s.indexOf(c) != -1 && s.indexOf(small) != -1) {
                return "" + c;
            }
        }
        return "";
    }
}