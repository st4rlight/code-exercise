package cn.st4rlight.leetcode;

import cn.st4rlight.model.ListNode;

/**
 * <a href="https://leetcode.cn/problems/merge-two-sorted-lists">21. 合并两个有序链表</a>
 * <p>注意获取下标对应的char时charAt而不是indexOf</p>
 *
 * @author st4rlight <st4rlight@163.com>
 * Created on 2022-07-04
 */
public class Solution21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode work = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                work.next = list1;
                work = work.next;
                list1 = list1.next;
                work.next = null;
            } else {
                work.next = list2;
                work = work.next;
                list2 = list2.next;
                work.next = null;
            }
        }

        if (list1 != null) {
            work.next = list1;
        }
        if (list2 != null) {
            work.next = list2;
        }

        return dummy.next;
    }
}
