package top.auzqy._0051_0100._0073;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * <a href="https://leetcode.cn/problems/set-matrix-zeroes/">https://leetcode.cn/problems/set-matrix-zeroes/</a>
 * todo 单元测试没有写
 */
public class Solution_0073 {

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes1(matrix);
        for (int[] ints : matrix) {
            System.out.println("[" + Arrays.toString(ints) + "],");
        }
    }

    /**
     * 解法1
     *
     * @param matrix 输入矩阵
     */
    public static void setZeroes1(int[][] matrix) {

        // todo 这里可以简化，仅仅留一个一维数组 m+n 即可
        // 已"i,j"的形式，作为字符串存储坐标
        LinkedList<String> waitingCoordinate = new LinkedList<>();

        // 寻找为0元素，并记录下其坐标
        // i 行号
        for (int i = 0; i < matrix.length; i++) {
            // j 列号
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    waitingCoordinate.add(i + "," + j);
                }
            }
        }

        // 依据坐标修改为0元素的行和列
        while (!waitingCoordinate.isEmpty()) {
            String coordinateStr = waitingCoordinate.pop();
            String[] coordinateArr = coordinateStr.split(",");
            if (coordinateArr.length != 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    int i = Integer.parseInt(coordinateArr[0]);
                    matrix[i][j] = 0;
                }
                for (int i = 0; i < matrix.length; i++) {
                    int j = Integer.parseInt(coordinateArr[1]);
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
