package top.auzqy._0051_0100._0101;

/**
 * description:  101. 对称二叉树
 *
 * https://leetcode-cn.com/problems/symmetric-tree/
 *
 * createTime: 2020/8/29 12:46
 * @author au
 */
public class Solution_0101 {

    public boolean isSymmetric(TreeNode root) {
        return solution1_by_au(root);
    }

    /**
     * description:
     *
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38 MB, 在所有 Java 提交中击败了53.79%的用户
     *
     * createTime: 2020/8/29 12:57
     * @author au
     * @param root
     * @return
     */
    private boolean solution1_by_au(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }

        if (root.left != null && root.right != null) {
            return isMirrorTree(root.left, root.right);
        }

        return false;
    }

    private boolean isMirrorTree(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }

        if (left != null && right != null) {
            if (left.val == right.val) {
                return isMirrorTree(left.right, right.left)
                        && isMirrorTree(left.left, right.right);
            }
        }

        return false;
    }

}
