package top.auzqy._1301_1350._1332;

/**
 * description:
 * createTime: 2020/7/22 23:26
 * @author au
 */
public class Solution_1332 {
    public int removePalindromeSub(String s) {
        if ("".equals(s)) {
            return 0;
        }
        if (s.equals(new StringBuilder(s).reverse().toString())) {
            return 1;
        }
        return 2;
    }
}
