class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }if(min>nums[i]){
                min=nums[i];
            }
        }
        int ans=1;
        for(int i=min;i>1;i--){
            if(max%i==0&&min%i==0){
                ans=i;
                break;
            }
        }
        return ans;
    }
}