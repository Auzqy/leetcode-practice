package top.auzqy._0051_0100._0051;

/**
 * description:
 *
 *  https://leetcode-cn.com/problems/jump-game/
 *  no.55
 *
 * createTime: 2020/4/17 14:00
 * @author au
 */
public class Solution_0051 {

    public boolean canJump(int[] nums) {
        int fastestLocation = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i <= fastestLocation) {
                fastestLocation = Math.max(fastestLocation, nums[i] + i);
                if (length-1 <= fastestLocation) {
                    return true;
                }
            }
        }
        return false;
    }

}
