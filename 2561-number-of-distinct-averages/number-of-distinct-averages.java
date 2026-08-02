class Solution {
    public int distinctAverages(int[] nums) {
       
    int left=0;
        Arrays.sort(nums);
        int sum=0;
        int right=nums.length-1;
        HashSet<Integer> set=new HashSet<>();
        while(left<right){
       sum=nums[left]+nums[right];
       set.add(sum);
       left++;
       right--;
        }
        return set.size();
    }
}