package top.auzqy._0551_0600._0589;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * description:  589. N叉树的前序遍历
 * <p>
 * https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 * <p>
 * createTime: 2020/8/26 00:53
 *
 * @author au
 */
public class Solution_0589 {

    public List<Integer> preorder(Node root) {
        List<Integer> res = new LinkedList<>();

        preOrder(root, res);

        return res;
    }

    private void preOrder(Node root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            if (root.children != null && !root.children.isEmpty()) {
                root.children.forEach(e -> {
                    if (e != null) {
                        preOrder(e, res);
                    }
                });
            }
        }
    }

}
