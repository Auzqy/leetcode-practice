package top.auzqy._0501_0550._0517;

/**
 * description:  https://leetcode-cn.com/problems/ugly-number/
 * createTime: 2020/8/4 15:18
 *
 * @author au
 */
public class Solution_0517 {

    /**
     * description: 参考官方解析
     *
     * https://leetcode-cn.com/problems/super-washing-machines/solution/chao-ji-xi-yi-ji-by-leetcode/
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * createTime: 2020/8/4 15:39
     * @author au
     * @param machines
     * @return
     */
    public int findMinMoves(int[] machines) {
        int machinesNum = machines.length, dressTotal = 0;
        for (int dressNum : machines) {
            dressTotal += dressNum;
        }
        if (dressTotal % machinesNum != 0) {
            return -1;
        }

        int finalDressNum = dressTotal / machinesNum;

        for (int i = 0; i < machinesNum; i++) {
            machines[i] -= finalDressNum;
        }

        int maxDressNum = 0, beforeCurSum = 0, res = 0;

        for (int dressNum : machines) {
            beforeCurSum += dressNum;
            maxDressNum = Math.max(maxDressNum, dressNum);
            int tmpRes = Math.max(maxDressNum, Math.abs(beforeCurSum));
            res = Math.max(res, tmpRes);
        }

        return res;

    }

}
