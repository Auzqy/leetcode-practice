package top.auzqy._1101_1150._1143;

import java.util.Arrays;

/**
 * description:  1143. 最长公共子序列
 *
 * https://leetcode-cn.com/problems/longest-common-subsequence/
 *
 * createTime: 2020/8/29 23:42
 * @author au
 */
public class Solution_1143 {

    public int longestCommonSubsequence(String text1, String text2) {
//        return solution1_by_au(text1, text2);
        return solution2_by_au(text1, text2);
    }

    private int solution2_by_au(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];

        // int 数组默认值就是 0，所以这两句可以省略
        // Arrays.fill(dp[0],0);

        for (int i = 1; i < len1 + 1; i++) {
            // dp[i][0] = 0;
            for (int j = 1; j < len2 + 1; j++) {

                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        return dp[len1][len2];
    }

    /**
     * description:
     *
     * 执行用时：12 ms, 在所有 Java 提交中击败了74.88%的用户
     * 内存消耗：43.4 MB, 在所有 Java 提交中击败了51.24%的用户
     *
     * Time Complexity: O()
     * Space Complexity: O()
     * createTime: 2020/8/30 00:10
     * @author au
     * @param text1
     * @param text2
     * @return
     */
    private int solution1_by_au(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];

        Arrays.fill(dp[0],0);

        for (int i = 1; i < len1 + 1; i++) {
            for (int j = 0; j < len2 + 1; j++) {
                if (j == 0) {
                    dp[i][j] = 0;
                    continue;
                }

                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    // dp[i][j] = Math.min(i,1 + dp[i-1][j - 1]);
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                    // dp[i][j] = Math.min(i,tmp);
                }
            }
        }

        return dp[len1][len2];
    }

}
