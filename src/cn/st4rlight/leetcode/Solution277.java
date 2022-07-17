package cn.st4rlight.leetcode;

/**
 * <a href="https://leetcode.cn/problems/find-the-celebrity">277. 搜寻名人</a>
 * <p>主要是分两遍遍历，第一遍遍历确认一个可能的，第二个遍历确认其是否就是最终的</p>
 *
 * @author zcz <zhengchangzai@kuaishou.com>
 * Created on 2022-07-17
 */
public class Solution277 {
    public int findCelebrity(int n) {
        if (n < 2) {
            return -1;
        }

        // 1.第一遍遍历，找到可能的
        int possible = 0;
        for (int i = 1; i < n; i++) {
            if (knows(possible, i)) {
                possible = i;
            }
        }

        // 2. 第二遍遍历，确认是否确实是名人
        for (int i = 0; i < n; i++) {
            if (i != possible && (knows(possible, i) || !knows(i, possible))) {
                return -1;
            }
        }

        return possible;
    }

    /**
     * 官方定义的辅助函数
     */
    private boolean knows(int a, int b) {
        return false;
    }
}
