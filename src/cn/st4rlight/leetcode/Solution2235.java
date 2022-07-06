package cn.st4rlight.leetcode;

/**
 * <a href="https://leetcode.cn/problems/add-two-integers">2235. 两整数相加</a>
 * <p>实际上如果这题不考虑越界，那确实没啥意思了</p>
 *
 * @author st4rlight <st4rlight@163.com>
 * Created on 2022-07-06
 */
public class Solution2235 {

    public int sum(int num1, int num2) {
        if ((num1 ^ num2) < 0 || num1 == 0 || num2 == 0) {
            // 两数符号不同，或有1数为0 ，直接相加
            return num1 + num2;
        } else if (num1 > 0 && num1 + num2 < 0) {
            // 两正数加和小于0，则溢出
            throw new RuntimeException("精度溢出");
        } else if (num1 < 0 && num1 + num2 >= 0) {
            // 两负数加和大于等于0，则溢出
            throw new RuntimeException("精度溢出");
        } else {
            // 不溢出，安全
            return num1 + num2;
        }
    }
}
