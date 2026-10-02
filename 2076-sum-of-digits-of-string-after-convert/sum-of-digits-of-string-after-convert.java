class Solution {
    public int getLucky(String s, int k) {
        String num = "";
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 'a' + 1;
            num = num + x;
        }

        int ans = 0;
        for (int j = 0; j < k; j++) {
            ans = 0;

            for (int i = 0; i < num.length(); i++) {
                ans += num.charAt(i) - '0';
            }
            num = "" + ans;
        }
        return ans;
    }
}