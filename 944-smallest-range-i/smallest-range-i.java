class Solution {
    public int smallestRangeI(int[] nums, int k) {
       int max=nums[0];
       int min=nums[0];
       int result;
       for(int i=1;i<nums.length;i++){
        if(max<nums[i]){
            max=nums[i];
        }else if(min>nums[i]){
            min=nums[i];
        }
       

       } 
       
        result=max-min-2*k;
        return Math.max(0,result);
    }
}