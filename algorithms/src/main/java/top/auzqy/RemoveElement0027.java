package top.auzqy;

import java.util.Arrays;

/**
 * @Description:
 *      题目链接： https://leetcode.com/problems/remove-element/
 *
 *
 * @Author: zqy
 * @CreateTime: 2019-06-04 18:01
 */
public class RemoveElement0027 {

    public static void main(String[] args) {
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        int[] nums = {0,0,1};
        int[] nums = {0,1};
//        int[] nums = {};
        System.out.println(removeElementSolutions1_au(nums,2));
        System.out.println(Arrays.toString(nums));
    }


    /**
     * @Description: au自己的解法
     *              // todo 待完成
     * @Author: zqy
     * @CreateTime: 2019-06-04 18:04
     * @param nums
     * @param val
     * @return
     */
    public static int removeElementSolutions1_au(int[] nums, int val) {
//        if (nums.length == 0) {
//            return 0;
//        }
        int head = 0;
        for (int tail = head + 1; tail < nums.length; tail++) {
            if (nums[head] == val && nums[tail] != val) {
                int temp = nums[head];
                nums[head] = nums[tail];
                nums[tail] = temp;
                head++;
            }else if(nums[head] != val){
                head++;
            }
        }
//        return nums.length - head;
        return head;
    }

}
