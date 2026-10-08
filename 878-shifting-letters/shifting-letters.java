class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] a = s.toCharArray();
        long sum = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            sum = (sum + shifts[i]) % 26;
            a[i] = (char) ('a' + (a[i] - 'a' + sum) % 26);
        }

        return new String(a);
    }
}