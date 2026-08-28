class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int count=0;
        int n=nums.length;
        int result=n/2;

    for(int i=0;i<nums.length;i++){
        if(nums[i]==nums[result]){
            count++;
        }
    }
    if(count>=2)return false;
    

        


        return true;
    }
}