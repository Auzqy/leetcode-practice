package top.auzqy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 *      题目链接： https://leetcode.com/problems/two-sum/
 *
 *      Problem:
 *          Given an array of integers, return indices of the two numbers such that they add up to
 *          a specific target.
 *
 *          You may assume that each input would have exactly one solution, and you may not use
 *          the same element twice.
 *
 *      Example:
 *
 *          Given nums = [2, 7, 11, 15], target = 9,
 *
 *          Because nums[0] + nums[1] = 2 + 7 = 9,
 *          return [0, 1].
 * @Author: zqy
 * @CreateTime: 2019-05-29 17:53
 */
public class TwoSum0001 {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(solutionOne(nums,target)));
    }

    /**
     * @Description: 创建数据的三种方式：
     *      //创建数组的第一种方法
     *      int[] arr=new int[6];
     *      //创建数组的第二种方法
     *      int[] x={1,2,3,4};
     *      //创建数组的第三种方法。
     *      int[] y= new int[]{1,2,3,4,5};
     * @Author: zqy
     * @CreateTime: 2019-05-29 18:19
     * @param nums
     * @param target
     * @return
     */
    public static int[] solutionOne(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        return null;
    }


    /////////////////////////////////////官网注释的三种解法////////////////////////////////////////////
    /* 解法链接： https://leetcode.com/problems/two-sum/solution/ */

    public int[] Approach1_BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * @Description:
     *      copy from official website:
     *          What is the best way to maintain a mapping of each element in the array to its index?
     *          A hash table.
     *      这句话给我感触最深，应当要清楚，熟悉，并且可以熟练应用每种数据结构的特性
     *
     * @Author: zqy
     * @CreateTime: 2019-05-30 12:49
     * @param nums
     * @param target
     * @return
     */
    public int[] Approach2_TwoPassHashTable(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    /**
     * @Description: It turns out we can do it in one-pass. While we iterate and inserting elements into
     *                  the table, we also look back to check if current element's complement already
     *                  exists in the table. If it exists, we have found a solution and return
     *                  immediately.
     *
     * @Author: zqy
     * @CreateTime: 2019-05-30 12:56
     * @param nums
     * @param target
     * @return
     */
    public int[] Approach3_OnePassHashTable(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
