class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            minPrice = Math.min(minPrice, items[i][1]);
        }

        int[] dp = new int[budget + 1];

        for (int i = 0; i < n; i++) {
            int freeCount = 0;
            int factor = items[i][0];
            int price = items[i][1];

            for (int j = 0; j < n; j++) {
                if (i != j && items[j][0] % factor == 0) {
                    freeCount++;
                }
            }

            int value = 1 + freeCount;

            for (int b = budget; b >= price; b--) {
                dp[b] = Math.max(dp[b], dp[b - price] + value);
            }
        }

        int ans = 0;

        for (int b = 0; b <= budget; b++) {
            int extraItems = (budget - b) / minPrice;
            ans = Math.max(ans, dp[b] + extraItems);
        }

        return ans;
    }
}