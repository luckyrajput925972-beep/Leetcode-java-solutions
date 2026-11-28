
import java.util.*;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {

        int n = items.length;
        int maxF = 0;
        long minPrice = Long.MAX_VALUE;

        
        for (int[] item : items) {
            maxF = Math.max(maxF, item[0]);
            minPrice = Math.min(minPrice, item[1]);
        }

    
        int[] freq = new int[maxF + 1];

        for (int[] item : items) {
            freq[item[0]]++;
        }

        
        int[] gain = new int[maxF + 1];

        for (int i = 1; i <= maxF; i++) {
            for (int j = i; j <= maxF; j += i) {
                gain[i] += freq[j];
            }
            gain[i]--; 
        }


        Arrays.sort(items, (a, b) ->
            Integer.compare(a[1], b[1])
        );

        long remaining = budget;
        long ans = 0;

        
        for (int[] item : items) {

            int factor = item[0];
            int price = item[1];

            if (price >= 2 * minPrice) {
                break;
            }

            int freeCount = gain[factor];

            if (freeCount <= 0) {
                continue;
            }

            long take = Math.min(
                freeCount,
                remaining / price
            );

            ans += take * 2;
            remaining -= take * price;
        }

        
        ans += remaining / minPrice;

        return (int) ans;
    }
}
