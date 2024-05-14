package _206;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        ListNode next = cur.next;
        ListNode temp;
        head.next = null;
        while (next != null) {
            temp = next.next;
            next.next = cur;
            cur = next;
            next = temp;
        }
        return cur;
    }
}


 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
