class Solution {
    public int longestSubsequence(int[] nums) {
        int count=0;
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
            if(xor==0){
                count++;
            }
        }
        if(xor!=0){
            return nums.length;
        }
        if(count==nums.length){
            return 0;
        }
        return nums.length-1;
    }
}