class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int count = 1;
        int cnt = 1;
        int max = 1;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] > nums[i-1]) {
                count++;
                cnt = 1;
            }
            else if(nums[i] < nums[i-1]) {
                cnt++;
                count = 1;
            }
            else {
                count = 1;
                cnt = 1;
            }

            max = Math.max(max, Math.max(count, cnt));
        }

        return max;
    }
}