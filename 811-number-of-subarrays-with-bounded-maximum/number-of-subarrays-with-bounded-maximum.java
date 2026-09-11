class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {

        int count = 0;
        int start = -1;
        int valid = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > right) {
                start = i;
            }

            if (nums[i] >= left) {
                valid = i;
            }

            count += valid - start;
        }

        return count;
    }
}