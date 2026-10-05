class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
         int []temp=new int[n];
        int i;
        for( i=0;i<n;i++){
            temp[(i+k)%n]=nums [i];
        }
        for(i=0;i<n;i++){
            nums[i]=temp[i];
        }
    }
}