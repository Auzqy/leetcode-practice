package top.auzqy._0001_0050._0046;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * description: 46. 全排列
 *
 * https://leetcode-cn.com/problems/permutations/
 *
 * createTime: 2020/8/29 10:47
 * @author au
 */
public class Solution_0046 {

    public List<List<Integer>> permute(int[] nums) {

        return solution1_by_au(nums);
    }

    /**
     * description:
     *
     * 执行用时：3 ms, 在所有 Java 提交中击败了47.13%的用户
     * 内存消耗：40.2 MB, 在所有 Java 提交中击败了23.18%的用户
     *
     * Time Complexity: O()
     * Space Complexity: O()
     * createTime: 2020/8/29 12:07
     * @author au
     * @param nums
     * @return
     */
    private List<List<Integer>> solution1_by_au(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> levelList = new ArrayList<>(nums.length);
        recur(res, nums, levelList);
        return res;
    }

    private void recur(List<List<Integer>> res, int[] nums, List<Integer> levelList) {
        if (levelList.size() == nums.length) {
            res.add(new ArrayList<>(levelList));
            return;
        }

        for (int num : nums) {
            if (!levelList.contains(num)) {
                levelList.add(num);
                recur(res, nums, levelList);
                levelList.remove(levelList.size() - 1);
            }
        }

    }

}
