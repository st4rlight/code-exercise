package cn.st4rlight.model;

/**
 * leetcode默认不适用getter、setter
 *
 * @author st4rlight <st4rlight@163.com>
 * Created on 2022-07-04
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
