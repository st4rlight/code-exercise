package cn.st4rlight.leetcode;

/**
 * <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii">80. 删除有序数组中的重复项 II</a>
 *
 * @author zcz <zhengchangzai@kuaishou.com>
 * Created on 2022-07-17
 */
public class Solution80 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        int lastIdx = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[lastIdx - 1]) {
                nums[++lastIdx] = nums[i];
            }
        }

        return lastIdx + 1;
    }
}
