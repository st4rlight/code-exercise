package cn.st4rlight.leetcode;

/**
 * <a href="https://leetcode.cn/problems/merge-sorted-array">88. 合并两个有序数组</a>
 * <p>本题如果逆向思维，从后面往前面插入最大的，就简单很多，要注意两点</p>
 * <ol>
 *     <li>从后往前，比较时要取最大</li>
 *     <li>第二个条件只要判断n >= 0即可</li>
 * </ol>
 *
 * @author st4rlight <st4rlight@163.com>
 * Created on 2022-07-07
 */
public class Solution88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIdx = m-- + n-- - 1;

        while (m >= 0 && n >= 0) {
            nums1[lastIdx--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }

        while (n >= 0) {
            nums1[lastIdx--] = nums2[n--];
        }
    }
}
