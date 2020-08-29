package top.auzqy._0001_0050._0017;

import java.util.*;

/**
 * description:  17. 电话号码的字母组合
 * <p>
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 * <p>
 * createTime: 2020/8/29 12:12
 *
 * @author au
 */
public class Solution_0017 {


    public List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<>();

        if (digits.length() != 0) {
            recur(res, digits, "",0);
        }

        return res;
    }

    /**
     * description:
     * 执行用时：2 ms, 在所有 Java 提交中击败了45.97%的用户
     * 内存消耗：40 MB, 在所有 Java 提交中击败了23.36%的用户
     *
     * createTime: 2020/8/29 12:35
     *
     * @param res    用于存储最后的结果
     * @param digits 传入原始的字符串
     * @param str    当前得到的应为字符串
     * @param index  当前处理到目标字符串的索引位置
     * @author au
     */
    private void recur(List<String> res, String digits, String str,int index) {
        if (str.length() == digits.length()) {
            res.add(str);
            return;
        }

//        char[] chars = digits.toCharArray();
//        for (int i = index; i < chars.length; i++) {
            List<String> letters = getLetter(digits.charAt(index));
            for (String letter : letters) {
                recur(res, digits,
                        str + letter,index+1);
            }
//        }
//        for (char aChar : chars) {
//            List<String> letters = getLetter(aChar);
//            for (String letter : letters) {
//                tmp = str + letter;
//                recur(res, digits,
//                        digits.substring(tmp.length()),
//                        tmp);
//            }
//        }
    }

    private List<String> getLetter(char aChar) {
        Map<Character, List<String>> map = new HashMap<>(8);
        map.put('2', Arrays.asList("a", "b", "c"));
        map.put('3', Arrays.asList("d", "e", "f"));
        map.put('4', Arrays.asList("g", "h", "i"));
        map.put('5', Arrays.asList("j", "k", "l"));
        map.put('6', Arrays.asList("m", "n", "o"));
        map.put('7', Arrays.asList("p", "q", "r", "s"));
        map.put('8', Arrays.asList("t", "u", "v"));
        map.put('9', Arrays.asList("w", "x", "y", "z"));
        return map.get(aChar);
    }

}
