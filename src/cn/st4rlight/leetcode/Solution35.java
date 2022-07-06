package cn.st4rlight.leetcode;

/**
 * <a href="https://leetcode.cn/problems/search-insert-position/">35. 搜索插入位置</a>
 * <p>二分查找，暴搜没意思</p>
 *
 * @author st4rlight <st4rlight@163.com>
 * Created on 2022-07-06
 */
public class Solution35 {

    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int left, int right) {
        int mid = (left + right) / 2;
        int midVal = nums[mid];

        if (target == midVal) {
            return mid;
        } else if (target < midVal) {
            return left == right ? left : binarySearch(nums, target, left, mid);
        } else {
            return left == right ? left + 1 : binarySearch(nums, target, mid + 1, right);
        }
    }
}
