package top.auzqy._0001_0050._0011;

/**
 * description:  11. 盛最多水的容器
 *
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * createTime: 2020/4/18 10:55
 * @author au
 */
public class Solution_0011 {

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;
        int area = 0;

        while (i < j) {
            if (height[i] <= height[j]) {
                area = (j - i) * height[i];
                i++;
            } else {
                area = (j - i) * height[j];
                j--;
            }
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
    
}
