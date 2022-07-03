package cn.st4rlight.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * <a href="https://leetcode.cn/problems/palindrome-number">9. 回文数</a>
 * <p>注意获取下标对应的char时charAt而不是indexOf</p>
 *
 * @author st4rlight <st4rlight@163.com>
 * Created on 2022-07-04
 */
public class Solution9 {

    public boolean isValid(String s) {
        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            int currChar = s.charAt(i);
            if (isLeft(currChar)) {
                stack.push(currChar);
            } else if (isRight(currChar)) {
                if (stack.isEmpty()) {
                    return false;
                }
                Integer pop = stack.pop();
                if (!isMatch(pop, currChar)) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public boolean isMatch(int left, int right) {
        if (left == '(' && right == ')') {
            return true;
        } else if (left == '{' && right == '}') {
            return true;
        } else if (left == '[' && right == ']') {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLeft(int left) {
        return left == '(' || left == '{' || left == '[';
    }

    public boolean isRight(int right) {
        return right == ')' || right == '}' || right == ']';
    }
}
