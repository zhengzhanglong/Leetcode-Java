package _203;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode result;
        ListNode cur = head;
        while (cur != null && cur.val == val) {
            cur= cur.next;
        }
        if (cur == null) return null;
        result = cur;
        while (cur != null){
            while (cur.next != null && cur.next.val == val) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return result;
    }
}


