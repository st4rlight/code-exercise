package cn.st4rlight.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import cn.st4rlight.model.TreeNode;

/**
 * <a href="https://leetcode.cn/problems/binary-tree-level-order-traversal">102. 二叉树的层序遍历</a>
 *
 * @author zcz <zhengchangzai@kuaishou.com>
 * Created on 2022-07-17
 */
public class Solution102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int cnt = queue.size();
            List<Integer> tempList = new ArrayList<>();

            for (int i = 0; i < cnt; i++) {
                TreeNode node = queue.poll();
                tempList.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            resultList.add(tempList);
        }

        return resultList;
    }
}
