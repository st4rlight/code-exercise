package cn.st4rlight.leetcode;

import cn.st4rlight.model.ListNode;

/**
 * <a href="https://leetcode.cn/problems/add-two-numbers/">2. 两数相加</a>
 * <p>注意l1、l2可能一长一短，而且remain最后可能不为0</p>
 *
 * @author st4rlight <st4rlight@163.com>
 * Created on 2022-07-04
 */
public class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode work = dummy;

        int remain = 0;
        int sum = 0;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + remain;
            remain = sum / 10;
            sum = sum % 10;
            work.next = new ListNode(sum);
            work = work.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            sum = l1.val + remain;
            remain = sum / 10;
            sum = sum % 10;
            work.next = new ListNode(sum);
            work = work.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            sum = l2.val + remain;
            remain = sum / 10;
            sum = sum % 10;
            work.next = new ListNode(sum);
            work = work.next;
            l2 = l2.next;
        }

        while (remain != 0) {
            work.next = new ListNode(remain);
            work = work.next;
            remain = 0;
        }

        return dummy.next;
    }
}
