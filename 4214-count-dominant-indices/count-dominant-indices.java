class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int[] suf = new int[n];
        suf[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            suf[i] = suf[i+1] + nums[i];
        }
        int count = 0;
        for(int i=0; i<n-1; i++){
            int avg = (suf[i+1])/(n-i-1);
            if(nums[i]>avg) count++;
        }
        return count;
    }
}