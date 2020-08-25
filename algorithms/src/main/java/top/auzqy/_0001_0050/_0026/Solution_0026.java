package top.auzqy._0001_0050._0026;

/**
 * description:  26. 删除排序数组中的重复项
 *
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 *
 * createTime: 2020/8/25 23:45
 * @author au
 */
public class Solution_0026 {

    public int removeDuplicates(int[] nums) {
        return solution1_by_au(nums);
    }

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
            if (j < length && j > k) {
                nums[k++] = nums[j];
                i = j;
            } else {
                i++;
            }
        }

        return count;
    }

}
