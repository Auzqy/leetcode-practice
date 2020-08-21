package top.auzqy._0151_0200._0152;

/**
 * description:  https://leetcode-cn.com/problems/maximum-product-subarray/
 * createTime: 2020/8/21 22:22
 * @author au
 */
public class Solution_0152 {

    public int maxProduct(int[] nums) {
        return solution1_by_copy(nums);
//        return solution2_by_copy(nums);
    }

    /**
     * 错误的写法，无法通过
     * @param nums
     * @return
     */
    private int solution1_by_copy(int[] nums) {
        int max = 1, min = 1;
        for (int num : nums) {
            if (num < 0) {
                int tmp = max;
                max = min;
                min = tmp;
            }
            max = Math.max(max * num, num);
            min = Math.min(min * num, num);
        }
        return max;
    }

    private int solution2_by_copy(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for (int num : nums) {
            if (num < 0) {
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax * num, num);
            imin = Math.min(imin * num, num);

            max = Math.max(max, imax);
        }
        return max;
    }

}
