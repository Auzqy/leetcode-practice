package top.auzqy._0151_0200._0191;

/**
 * description:
 * createTime: 2020/7/22 23:09
 * @author au
 */
public class Solution_0191 {

    public int hammingWeight(int n) {
//        return solution1(n);
        return solution2(n);
    }

    private int solution1(int n) {
        int count = 0;
        while(n != 0){
            n &= (n-1);
            count++;
        }
        return count;
    }

    private int solution2(int n) {
        int mask =1, count = 0;
        while (mask != 0) {
            if ((mask & n) != 0) {
                count++;
            }
            mask <<= 1;
        }
        return count;
    }

}
