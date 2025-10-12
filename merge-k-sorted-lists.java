/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0), tail = dummy;

        while (true) {
            ListNode min = null;
            int idx = -1;

            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) continue;
                if (min == null || lists[i].val < min.val) {
                    min = lists[i];
                    idx = i;
                }
            }

            if (min == null) break; // all lists are empty

            lists[idx] = lists[idx].next;
            tail.next = min;
            tail = tail.next;
        }

        return dummy.next;
    }
}
