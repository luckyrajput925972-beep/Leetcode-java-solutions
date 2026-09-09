class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);

        int ans = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int next = nums[i - 1] + 1;
                ans += next - nums[i];
                nums[i] = next;
            }
        }

        return ans;
    }
}