package cn.st4rlight.leetcode;

import java.util.ArrayList;
import java.util.List;

import cn.st4rlight.model.TreeNode;

/**
 * <a href="https://leetcode.cn/problems/binary-tree-preorder-traversal">144. 二叉树的前序遍历</a>
 *
 * @author zcz <zhengchangzai@kuaishou.com>
 * Created on 2022-07-17
 */
public class Solution144 {

    private List<Integer> resultList = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        preTrace(root);
        return resultList;
    }

    public void preTrace(TreeNode root) {
        if (root == null) {
            return;
        }

        resultList.add(root.val);
        preTrace(root.left);
        preTrace(root.right);
    }

    public List<Integer> morrisPreTrace(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();

        TreeNode predecessor = null;
        while (root != null) {
            if (root.left != null) {
                predecessor = root.left;
                while (predecessor.right != null && predecessor.right != root) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    predecessor.right = root;
                    resultList.add(root.val);
                    root = root.left;
                } else {
                    predecessor.right = null;
                    root = root.right;
                }
            } else {
                resultList.add(root.val);
                root = root.right;
            }
        }

        return resultList;
    }
}
