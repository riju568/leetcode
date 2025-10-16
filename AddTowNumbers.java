//https://leetcode.com/problems/add-two-numbers/description/?filters=tag%3AJava
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(0), t = h; // h = dummy head, t = tail pointer
        int c = 0; // carry

        while (l1 != null || l2 != null || c != 0) {
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;

            int sum = v1 + v2 + c;
            c = sum / 10;

            t.next = new ListNode(sum % 10);
            t = t.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return h.next; // skip dummy head
    }
}
