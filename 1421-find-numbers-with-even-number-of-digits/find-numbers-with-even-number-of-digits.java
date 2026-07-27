class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = 0;
            int temp = num;
            while (temp != 0) {
                digits++;
                temp /= 10;
            }
            // Handle the edge case if the number is 0 (which has 1 digit)
            if (num == 0) {
                digits = 1;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}