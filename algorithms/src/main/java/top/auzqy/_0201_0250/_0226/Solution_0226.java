package top.auzqy._0201_0250._0226;

import java.util.LinkedList;
import java.util.Queue;

/**
 * description:  https://leetcode-cn.com/problems/invert-binary-tree/
 * createTime: 2020/7/21 11:19
 * @author au
 */
public class Solution_0226 {
    public TreeNode invertTree(TreeNode root) {

        return solution1(root);
    }

    private TreeNode solution1(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    private TreeNode solution2(TreeNode root) {
        if (root == null) {
            return root;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();

            TreeNode tmp = poll.left;
            poll.left = poll.right;
            poll.right = tmp;

            if (poll.left != null) {
                queue.add(poll.left);
            }
            if (poll.right != null) {
                queue.add(poll.right);
            }
        }

        return root;
    }


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}