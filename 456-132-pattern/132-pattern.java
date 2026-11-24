class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int val = Integer.MIN_VALUE;
        for(int i = nums.length - 1; i > -1; i--){
            if(nums[i] < val){
                return true;
            }
            while(!st.isEmpty() && st.peek() < nums[i]){
                val = st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}