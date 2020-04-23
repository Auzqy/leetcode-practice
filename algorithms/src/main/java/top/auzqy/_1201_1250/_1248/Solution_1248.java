package top.auzqy._1201_1250._1248;

/**
 * description:
 *
 * 给你一个整数数组 nums 和一个整数 k。
 *
 * 如果某个 连续 子数组中恰好有 k 个奇数数字，我们就认为这个子数组是「优美子数组」。
 *
 * 请返回这个数组中「优美子数组」的数目。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,1,2,1,1], k = 3
 * 输出：2
 * 解释：包含 3 个奇数的子数组是 [1,1,2,1] 和 [1,2,1,1] 。
 * 示例 2：
 *
 * 输入：nums = [2,4,6], k = 1
 * 输出：0
 * 解释：数列中不包含任何奇数，所以不存在优美子数组。
 * 示例 3：
 *
 * 输入：nums = [2,2,2,1,2,2,1,2,2,2], k = 2
 * 输出：16
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 50000
 * 1 <= nums[i] <= 10^5
 * 1 <= k <= nums.length
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-number-of-nice-subarrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * createTime: 2020/4/21 12:31
 * @author au
 */
public class Solution_1248 {

    /**
     * 求解思路
     */
    public int numberOfSubarrays(int[] nums, int k) {
        int len = nums.length;
        int[] oddArr = new int[len + 2];
        int res = 0;
        int feed = 0;
        for (int i = 0; i < len; i++) {
            if (isOdd(nums[i])) {
                oddArr[++feed] = i;
            }
        }

        oddArr[0] = -1;
        oddArr[feed + 1] = len;

        for (int i = 1; i + k < feed + 2; i++) {
            res += (oddArr[i] - oddArr[i - 1]) * (oddArr[i + k] - oddArr[i + k - 1]);
        }

        return res;
    }

    private boolean isOdd(int num) {
        return 1 == (1 & num);
    }

}
