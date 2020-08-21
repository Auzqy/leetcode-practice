package top.auzqy._0101_0150._0118;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * description:  https://leetcode-cn.com/problems/pascals-triangle/
 * createTime: 2020/8/21 23:35
 * @author au
 */
public class Solution_0118 {
    public List<List<Integer>> generate(int numRows) {
//        return solution1_by_au(numRows);
        return solution1_optimize_by_au(numRows);
    }

    private List<List<Integer>> solution1_optimize_by_au(int numRows) {
        List<List<Integer>> res = new ArrayList<>(numRows);

        for (int i = 1; i <= numRows; i++) {
            List<Integer> innerList = new ArrayList<>(i);
            if (i == 1) {
                innerList.add(1);
            } else if (i == 2) {
                innerList.add(1);
                innerList.add(1);
            } else {
                innerList.add(1);
                for (int j = 1; j < i-1; j++) {
                    List<Integer> last = res.get(i-2);
                    innerList.add(last.get(j - 1) + last.get(j));
                }
                innerList.add(1);
            }
            res.add(innerList);
        }

        return res;
    }

    private List<List<Integer>> solution1_by_au(int numRows) {
        List<List<Integer>> res = new ArrayList<>(numRows);

        // 用于存放上一个 list 元素的
        List<Integer> lastTmpList = new LinkedList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> innerList = new ArrayList<>(i);
            if (i == 1) {
                innerList.add(1);
            } else if (i == 2) {
                innerList.add(1);
                innerList.add(1);
                // 重新记录
                lastTmpList.clear();
                lastTmpList.addAll(innerList);
            } else {
                innerList.add(1);
                for (int j = 1; j < lastTmpList.size(); j++) {
                    innerList.add(lastTmpList.get(j - 1) + lastTmpList.get(j));
                }
                innerList.add(1);

                // 重新记录
                lastTmpList.clear();
                lastTmpList.addAll(innerList);
            }
            res.add(innerList);
        }


        return res;
    }
}
