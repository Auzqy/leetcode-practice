package top.auzqy._0001_0050._0026;

/**
 * description:  26. 删除排序数组中的重复项
 * <p>
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * <p>
 * createTime: 2020/8/25 23:45
 *
 * @author au
 */
public class Solution_0026 {

    public int removeDuplicates(int[] nums) {
//        return solution1_by_au(nums);
        return solution2_by_copy(nums);
    }

    /**
     * description:
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * createTime: 2020/8/26 00:40
     * @author au
     * @param nums
     * @return
     */
    private int solution2_by_copy(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    /**
     * description:
     * 执行用时：1 ms, 在所有 Java 提交中击败了98.48%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了81.11%的用户
     *
     * createTime: 2020/8/26 00:36
     * @author au
     * @param nums
     * @return
     */
    private int solution1_by_au(int[] nums) {

        int count = 0;
        int k = 1;
        int length = nums.length;
        for (int i = 0; i < length; ) {
            int j = i + 1;
            while (j < length && nums[j] == nums[i]) {
                j++;
            }
            count++;
            if (j >= length) {
                break;
            }else if (j >= k) {
                nums[k++] = nums[j];
                i = j;
            } else {
                i++;
            }
        }

        return count;
    }

}
