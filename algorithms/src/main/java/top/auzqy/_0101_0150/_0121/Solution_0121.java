package top.auzqy._0101_0150._0121;

/**
 * description:  https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * createTime: 2020/7/30 15:47
 * @author au
 */
public class Solution_0121 {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int maxProfit = 0, buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - buy);
            }
        }
        return maxProfit;
    }

}
