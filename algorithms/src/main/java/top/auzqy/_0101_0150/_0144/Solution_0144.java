package top.auzqy._0101_0150._0144;

import java.util.LinkedList;
import java.util.List;

/**
 * description:  144. 二叉树的前序遍历
 * <p>
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * <p>
 * createTime: 2020/8/26 00:45
 *
 * @author au
 */
public class Solution_0144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();

        preOrder(root, res);

        return res;
    }

    private void preOrder(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            if (root.left != null) {
                preOrder(root.left, res);
            }
            if (root.right != null) {
                preOrder(root.right, res);
            }
        }
    }

}
