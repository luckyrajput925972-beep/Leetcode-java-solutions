class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int count=0;
        


    for(int i=0;i<nums.length;i++){
        if(nums[nums.length/2]==nums[i]){
            count++;
        }
    }
    if(count==1)return true;
    

        


        return false;
    }
}