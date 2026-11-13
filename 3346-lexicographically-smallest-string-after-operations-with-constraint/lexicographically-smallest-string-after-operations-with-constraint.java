
class Solution {
    public String getSmallestString(String s, int k) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            int dist = arr[i] - 'a';

            int cost = Math.min(dist, 26 - dist);

            if (cost <= k) {
                arr[i] = 'a';
                k -= cost;
            }
            else {
                arr[i] = (char)(arr[i] - k);
                break;
            }
        }

        return new String(arr);
    }
}
