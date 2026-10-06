class Solution {
    public int subarraySum(int[] nums, int k) {

        int[] pre = new int[nums.length];

        pre[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] + nums[i];
        }

        int count = 0;

        for(int i = 0; i < nums.length; i++) {

            if(pre[i] == k) {
                count++;
            }

            for(int j = 0; j < i; j++) {
                if(pre[i] - pre[j] == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
