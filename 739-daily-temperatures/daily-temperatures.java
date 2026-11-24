class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];
        int j = 0;
        st.push(0);
        for(int i=1; i<n; i++){
            int x = temperatures[i];
            while(!st.isEmpty() && temperatures[st.peek()] < x){
                j = st.pop();
                ans[j] = i - j;
            }
            st.push(i);
        }
        return ans;
    }
}