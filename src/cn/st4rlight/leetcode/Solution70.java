package cn.st4rlight.leetcode;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/climbing-stairs">70. 爬楼梯</a>
 *
 * @author zcz <zhengchangzai@kuaishou.com>
 * Created on 2022-07-18
 */
public class Solution70 {

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 0);

        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
