package top.auzqy;

import java.util.Arrays;

/**
 * @Description:
 *      题目链接： https://leetcode.com/problems/3sum/
 *
 *      该题针对性的解决思路： https://leetcode.com/problems/remove-duplicates-from-sorted-array/solution/
 *
 * @Author: zqy
 * @CreateTime: 2019-06-04 16:58
 */
public class RemoveDuplicatesFromSortedArray0026 {

    public static void main(String[] args) {
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        int[] nums = {0,1};
        int[] nums = {};
        System.out.println(officialSolutions1_au(nums));
        System.out.println(Arrays.toString(nums));
    }

    /**
     * @Description: TMD 根本就没有解出来
     * @Author: zqy
     * @CreateTime: 2019-06-04 17:09
     * @param nums
     * @return
     */
    public static int removeDuplicatesSolution1_au(int[] nums) {
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                }
            }
        }
        return nums.length;
    }


    ///////////////////////////////////// official solutions /////////////////////////////////////////

    /**
     * @Description: 官方的解题思路 但是是au的自己实现
     *
     * @Author: zqy
     * @CreateTime: 2019-06-04 17:28
     * @param nums
     * @return
     */
    public static int officialSolutions1_au(int[] nums) {
        if (nums.length == 0) return 0; // 对空元素的数组进行校验

        int head = 0; // 头指针
        for (int tail = 0; tail < nums.length; tail++) { // 尾指针
            if (nums[head] != nums[tail] && head + 1 <= tail) {
                nums[head + 1] = nums[tail];
                head++;
            }
        }
        return head + 1; // 即不重复的元素有这么多个
    }


    /**
     * @Description: 官方的答案
     * @Author: zqy
     * @CreateTime: 2019-06-04 17:52
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
