package top.auzqy._0301_0350._0322;

/**
 * description: 322. 零钱兑换
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: coins = [1, 2, 5], amount = 11
 * 输出: 3
 * 解释: 11 = 5 + 5 + 1
 * 示例 2:
 *
 * 输入: coins = [2], amount = 3
 * 输出: -1
 *  
 *
 * 说明:
 * 你可以认为每种硬币的数量是无限的。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/coin-change
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * createTime: 2020/8/21 13:08
 *
 * @author au
 */
public class Solution_0322 {

    public int coinChange(int[] coins, int amount) {
//        return solution1_by_copy(coins, amount);
        return solution2_by_copy(coins, amount);
    }

    private int solution2_by_copy(int[] coins, int amount) {
        if (amount < 1) {
            return 0;
        }
        return coinChange_solution2(coins, amount, new int[amount]);
    }

    private int coinChange_solution2(int[] coins, int rem, int[] count) {
        if (rem < 0) {
            return -1;
        }
        if (rem == 0) {
            return 0;
        }
        if (count[rem - 1] != 0) {
            return count[rem - 1];
        }
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = coinChange_solution2(coins, rem - coin, count);
            if (res >= 0 && res < min) {
                min = 1 + res;
            }
        }
        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[rem - 1];
    }

    /**
     * description: 搜索回溯 [超出时间限制]
     * Time Complexity: O(S^n)
     * Space Complexity: O(n)
     * createTime: 2020/8/21 15:11
     * @author au
     * @param coins
     * @param amount
     * @return
     */
    private int solution1_by_copy(int[] coins, int amount) {
        return coinChange_solution1(0, coins, amount);
    }

    private int coinChange_solution1(int idxCoin, int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (idxCoin < coins.length && amount > 0) {
            int maxVal = amount / coins[idxCoin];
            int minCost = Integer.MAX_VALUE;
            for (int x = 0; x <= maxVal; x++) {
                if (amount >= x * coins[idxCoin]) {
                    int res = coinChange_solution1(
                            idxCoin + 1,
                            coins,
                            amount - x * coins[idxCoin]);
                    if (res != -1) {
                        minCost = Math.min(minCost, res + x);
                    }
                }
            }
            return (minCost == Integer.MAX_VALUE)? -1: minCost;
        }
        return -1;
    }
}
