package cn.st4rlight.leetcode;

/**
 * <a href="https://leetcode.cn/problems/palindrome-number">9. 回文数</a>
 *
 * @author st4rlight <st4rlight@163.com>
 * Created on 2022-07-04
 */
public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int work = x;
        while (work != 0) {
            int num = work % 10;
            work = work / 10;
            reverse = reverse * 10 + num;
        }

        return reverse == x;
    }
}
