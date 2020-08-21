package top.auzqy._0101_0150._0121;

/**
 * description:  https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * createTime: 2020/8/21 15:35
 * @author au
 */
public class Solution_0121_exercise01 {

    /**
     * description:
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * createTime: 2020/8/21 15:49
     * @author au
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

}
