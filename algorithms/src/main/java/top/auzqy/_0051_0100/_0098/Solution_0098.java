package top.auzqy._0051_0100._0098;

/**
 * description:  98. 验证二叉搜索树
 * <p>
 * https://leetcode-cn.com/problems/validate-binary-search-tree/
 * <p>
 * createTime: 2020/8/26 10:08
 *
 * @author au
 */
public class Solution_0098 {

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }

        int val = node.val;
        if (lower != null && val <= lower) {
            return false;
        }
        if (upper != null && val >= upper) {
            return false;
        }

        if (!helper(node.right, val, upper)) {
            return false;
        }
        return helper(node.left, lower, val);
    }




//    public boolean isValidBST(TreeNode root) {
////        if (root == null) {
////            return true;
////        }
////        return midOrder(root, root.left, root.right);
//        return midOrder(root, null, null);
//    }

//    private boolean midOrder(TreeNode root, Integer low, Integer high) {
//        if (root == null) {
//            return true;
//        }
//
//        if (root.left == null && root.right == null) {
//            return true;
//        }
//
//
//        if (root.left == null) {
//            if (root.val < root.right.val) {
//                return midOrder(root.right, low, null);
//            }
//            return false;
//        }
//
//        if (root.right == null) {
//            if (root.left.val < root.val) {
//                return midOrder(root.left, null, root.val);
//            }
//            return false;
//        }
//
//        if (root.left.val < root.val && root.val < root.right.val) {
//            midOrder(root.left, null, root.val);
//            midOrder(root.right, root.val, null);
//        }
//
//        return false;
//    }

//    private boolean midOrder(TreeNode root, TreeNode left, TreeNode right) {
//        if (root == null) {
//            return true;
//        }
//
//        if (root.left == null && root.right == null) {
//            return true;
//        }
//
//
//        if (root.left == null) {
//            if (root.val < root.right.val) {
//                return midOrder(root.right, root.right.left, root.right.right);
//            }
//            return false;
//        }
//
//        if (root.right == null) {
//            if (root.left.val < root.val) {
//                return midOrder(root.left, root.left.left, root.left.right);
//            }
//            return false;
//        }
//
//        if (root.left.val < root.val && root.val < root.right.val) {
//            midOrder(root.left, root.left.left, root.left.right);
//            midOrder(root.right, root.right.left, root.right.right);
//        }
//
//        return false;
//
//    }


}
