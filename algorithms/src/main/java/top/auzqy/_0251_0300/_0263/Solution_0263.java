package top.auzqy._0251_0300._0263;

/**
 * description:  https://leetcode-cn.com/problems/ugly-number/
 * createTime: 2020/8/4 15:18
 *
 * @author au
 */
public class Solution_0263 {

    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }

        return num == 1;
    }
}
