package top.auzqy._0101_0150._0122;

/**
 * description:  https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 * createTime: 2020/8/21 15:52
 * @author au
 */
public class Solution_0122 {

    public int maxProfit(int[] prices) {
        return solution1_by_copy(prices, 0);
    }

    /**
     * description: 暴力法
     * Time Complexity: O(n^n)
     * Space Complexity: O(n)
     * createTime: 2020/8/21 15:56
     * @author au
     * @param prices
     * @param s
     * @return
     */
    public int solution1_by_copy(int[] prices, int s) {
        if (s >= prices.length) {
            return 0;
        }
        int max = 0;
        for (int start = s; start < prices.length; start++) {
            int maxprofit = 0;
            for (int i = start + 1; i < prices.length; i++) {
                if (prices[start] < prices[i]) {
                    int profit
                            = solution1_by_copy(prices, i + 1)
                            + prices[i]
                            - prices[start];
                    if (profit > maxprofit) {
                        maxprofit = profit;
                    }
                }
            }
            if (maxprofit > max) {
                max = maxprofit;
            }
        }
        return max;
    }

}
