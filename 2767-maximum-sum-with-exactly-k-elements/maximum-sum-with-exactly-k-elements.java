class Solution {
    public int maximizeSum(int[] nums, int k) {
       Arrays.sort(nums);
       int sum=nums[nums.length-1];
       int x=nums[nums.length-1];
       for(int i=1;i<k;i++){
        int m=x+1;
        sum+=m;
        x++;
       } 
       return sum;
    }
}