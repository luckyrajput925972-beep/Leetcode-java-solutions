class Solution {
    public boolean predictTheWinner(int[] nums) {
        
    boolean ans=predicter(nums,0,nums.length-1)>=0;
    return ans;
    }
    private int predicter(int nums[],int left,int right){
        if(left==right)
      return nums[left];
       int pickLeft = nums[left] - predicter(nums, left + 1, right);

        int pickRight = nums[right] - predicter(nums, left, right - 1);

        return Math.max(pickLeft, pickRight);
    }
   
}