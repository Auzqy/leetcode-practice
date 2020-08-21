package top.auzqy._0051_0100._0064;

import javax.activation.MailcapCommandMap;
import java.util.Arrays;

/**
 * description: 64. 路径和最小
 * <p>
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，
 * 使得路径上的数字总和为最小。
 * <p>
 * 说明：每次只能向下或者向右移动一步。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 *   [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * createTime: 2020/8/21 12:27
 *
 * @author au
 */
public class Solution_0064 {

    public int minPathSum(int[][] grid) {

        return solution1_by_au(grid);
    }



    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了 22.10% 的用户
     * 内存消耗：42.3 MB, 在所有 Java 提交中击败了83.19%的用户
     *
     * @param grid
     * @return
     */
    private int solution1_by_au(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] minGrid = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    minGrid[i][j] = grid[i][j];
                } else {
                    minGrid[i][j]
                            = Math.min(upLoad(minGrid, i, j), leftLoad(minGrid, i, j))
                            + grid[i][j];
                }
            }
        }

//        for (int i = 0; i < m; i++) {
//            System.out.println(Arrays.toString(minGrid[i]));
//        }

        return minGrid[m - 1][n - 1];
    }

    /**
     * 用于计算该点上一个点的最短路径
     *
     * @param minGrid
     * @param i
     * @param j
     * @return
     */
    private int leftLoad(int[][] minGrid, int i, int j) {
        if (j - 1 < 0) {
            // 返回该点上边的值
            return minGrid[i - 1][j];
        }
        return minGrid[i][j - 1];
    }

    /**
     * 用于计算该点上一个点的最短路径
     *
     * @param minGrid
     * @param i
     * @param j
     * @return
     */
    private int upLoad(int[][] minGrid, int i, int j) {
        if (i - 1 < 0) {
            // 返回该点左边的值
            return minGrid[i][j - 1];
        }
        return minGrid[i - 1][j];
    }

}
