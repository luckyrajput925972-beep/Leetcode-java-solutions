class Solution {
    public int buyChoco(int[] prices, int money) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++) {

            if(prices[i] < first) {
                second = first;
                first = prices[i];
            }
            else if(prices[i] < second) {
                second = prices[i];
            }
        }

        int sum = first + second;

        if(sum <= money) {
            return money - sum;
        }

        return money;
    }
}