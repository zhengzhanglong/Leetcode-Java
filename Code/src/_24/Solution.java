package _24;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode cur = head;
        ListNode next = head.next;
        ListNode temp = next.next;
        ListNode pre;
        ListNode begin;
        next.next = head;
        head.next = temp;
        begin = next;
        while (next != null) {
            pre = cur;
            if (cur.next == null) break;
            cur = cur.next;
            if (cur.next == null) break;
            next = cur.next;
            temp = next.next;
            next.next = cur;
            pre.next = next;
            cur.next = temp;
        }
        return begin;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}