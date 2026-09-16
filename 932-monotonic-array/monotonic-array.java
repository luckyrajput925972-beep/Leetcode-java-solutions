class Solution {
    public boolean isMonotonic(int[] nums) {
     
    int i=0,j=1;
    if(nums[0]<nums[nums.length-1])
{    while(j<nums.length){
        if(nums[i]>nums[j]){
            return false;
        }
        i++;j++;}
    }
     else 
{    while(j<nums.length){
        if(nums[i]<nums[j]){
            return false;
        }
        i++;j++;}
        
    }
    return true;
    }
}
