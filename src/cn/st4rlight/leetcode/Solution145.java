package cn.st4rlight.leetcode;

import java.util.ArrayList;
import java.util.List;

import cn.st4rlight.model.TreeNode;

/**
 * <a href="https://leetcode.cn/problems/binary-tree-postorder-traversal/submissions">145. 二叉树的后序遍历</a>
 * <p>参考: <a href="https://zhuanlan.zhihu.com/p/101321696">神级遍历——morris</a></p>
 *
 * @author zcz <zhengchangzai@kuaishou.com>
 * Created on 2022-07-17
 */
public class Solution145 {

    private List<Integer> resultList = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postTrace(root);
        return resultList;
    }

    public void postTrace(TreeNode root) {
        if (root == null) {
            return;
        }

        postTrace(root.left);
        postTrace(root.right);
        resultList.add(root.val);
    }

    public List<Integer> morrisPostTrace(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();

        TreeNode predecessor = null;
        TreeNode work = root;
        while (work != null) {
            if (work.left != null) {
                predecessor = work.left;
                while (predecessor.right != null && predecessor.right != work) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    predecessor.right = work;
                    work = work.left;
                } else {
                    predecessor.right = null;
                    printEdge(work.left, resultList);
                    work = work.right;
                }
            } else {
                work = work.right;
            }
        }

        printEdge(root, resultList);
        return resultList;
    }

    private void printEdge(TreeNode node, List<Integer> resultList) {
        if (node == null) {
            return;
        }

        TreeNode tail = reverseEdge(node);
        TreeNode curr = tail;
        while (curr != null) {
            resultList.add(curr.val);
            curr = curr.right;
        }

        reverseEdge(tail);
    }

    private TreeNode reverseEdge(TreeNode node) {
        if (node == null) {
            return node;
        }

        TreeNode pre = null;
        while (node != null) {
            TreeNode next = node.right;
            node.right = pre;
            pre = node;
            node = next;
        }

        return pre;
    }
}
