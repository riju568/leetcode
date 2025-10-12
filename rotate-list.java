class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;

        ListNode tail = head;
        int n = 1;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }
        tail.next = head;

        int steps = n - (k % n);
        for (int i = 1; i < steps; i++) head = head.next;

        ListNode newHead = head.next;
        head.next = null;
        return newHead;
    }
}
