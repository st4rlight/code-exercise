package cn.st4rlight.leetcode;

/**
 * <a href="https://leetcode.cn/problems/remove-element">27. 移除元素</a>
 *
 * @author zcz <zhengchangzai@kuaishou.com>
 * Created on 2022-07-17
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int lastIdx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[++lastIdx] = nums[i];
            }
        }

        return lastIdx + 1;
    }
}
