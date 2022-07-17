package cn.st4rlight.leetcode;

/**
 * <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array">26. 删除有序数组中的重复项</a>
 *
 * @author zcz <zhengchangzai@kuaishou.com>
 * Created on 2022-07-17
 */
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int lastIdx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[lastIdx]) {
                nums[++lastIdx] = nums[i];
            }
        }

        return lastIdx + 1;
    }
}
