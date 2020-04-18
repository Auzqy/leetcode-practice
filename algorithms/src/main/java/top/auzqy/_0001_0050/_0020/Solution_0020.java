package top.auzqy._0001_0050._0020;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * description:  20. 有效的括号
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * createTime: 2020/4/18 11:33
 * @author au
 */
public class Solution_0020 {

    public boolean isValid(String s) {
//        return solution1(s);
        return solution2(s);
    }

    private boolean solution1(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        Map<Character, Character> rightMap = rightMap();
        for (char aChar : chars) {
            if (rightMap.containsKey(aChar)) {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (!pop.equals(rightMap.get(aChar))) {
                    return false;
                }
            } else {
                stack.push(aChar);
            }
        }
        return stack.isEmpty();
    }

    private Map<Character, Character> rightMap() {
        Map<Character, Character> rightMap = new HashMap<>();
        rightMap.put(')', '(');
        rightMap.put(']', '[');
        rightMap.put('}', '{');
        return rightMap;
    }

    public boolean solution2(String s) {
        if (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            return isValid(s.replace("()", "").replace("[]", "").replace("{}", ""));
        } else {
            return "".equals(s);
        }
    }

}
