package _19;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode cur = head;
        ListNode pre = head;
        for (int i = 0; i < n-1; i++) cur = cur.next;
        while (cur.next != null) {
            cur = cur.next;
            pre = temp;
            temp = temp.next;
        }
        if (temp == head){
            head = head.next;
        }else {
            pre.next = temp.next;
        }
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}