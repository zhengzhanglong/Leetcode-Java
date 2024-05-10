package _707;

public class Solution {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtIndex(0,10);
        obj.addAtIndex(0,10);
        obj.addAtIndex(0,10);
        obj.get(0);
    }
}

class MyLinkedList {

    ListNode head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if (index >= size) return -1;
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val;
    }

    public void addAtHead(int val) {
        if (size == 0) {
            head = new ListNode(val);
            head.next = head;
            head.prev = head;
        }else {
            ListNode trans = new ListNode(val);
            trans.val = val;
            trans.next = head;
            trans.prev = head.prev;
            head.prev.next = trans;
            head.prev = trans;
            head = trans;
        }
        size++;
    }

    public void addAtTail(int val) {
        if (size == 0) {
            head = new ListNode(val);
            head.next = head;
            head.prev = head;
        }else {
            ListNode trans = new ListNode(val);
            trans.val = val;
            trans.next = head;
            trans.prev = head.prev;
            head.prev.next = trans;
            head.prev = trans;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (size == 0) {
            addAtHead(val);
            return;
        }
        if (index == 0){
            addAtHead(val);
            return;
        }
        ListNode trans = head;
        for (int i = 0; i < index; i++) {
            head = head.next;
        }
        head = trans;
    }

    public void deleteAtIndex(int index) {
        if (index >= size) return;
        if (index == 0){
            if (size == 1) {
                head = null;
            }else {
                head.next.prev = head.prev;
                head.prev.next = head.next;
                head = head.next;
            }
        }else {
            ListNode trans = head;
            for (int i = 0; i < index; i++) {
                trans = trans.next;
            }
            trans.prev.next = trans.next;
            trans.next.prev = trans.prev;
        }
        size--;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next, ListNode prev) { this.val = val; this.next = next; this.prev = prev; }
}