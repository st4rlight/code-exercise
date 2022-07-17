package cn.st4rlight.leetcode;

import java.util.ArrayList;
import java.util.List;

import cn.st4rlight.model.TreeNode;

/**
 * <a href="https://leetcode.cn/problems/binary-tree-inorder-traversal">94. 二叉树的中序遍历</a>
 *
 * @author zcz <zhengchangzai@kuaishou.com>
 * Created on 2022-07-17
 */
public class Solution94 {

    private List<Integer> resultList = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        midTrace(root);
        return resultList;
    }

    public void midTrace(TreeNode root) {
        if (root == null) {
            return;
        }

        midTrace(root.left);
        resultList.add(root.val);
        midTrace(root.right);
    }



    public List<Integer> morrisMidTrace(TreeNode root) {
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
                    root = root.left;
                } else {
                    predecessor.right = null;
                    resultList.add(root.val);
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
