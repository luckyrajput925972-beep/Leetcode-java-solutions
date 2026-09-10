class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int sum=0;
       int max=Integer.MIN_VALUE;
       int total=0;
       int minsum=0;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        max=Math.max(sum,max);
        if(sum<0){
            sum=0;}
            minsum+=nums[i];
            min=Math.min(min,minsum);
        if(minsum>0){
            minsum=0;
        }
        total+=nums[i];
       }
        if(max<0){
            return max;
        }
        int ans=total-min;
        return Math.max(ans,max);
        
        
    }
}