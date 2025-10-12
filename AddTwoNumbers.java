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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        // Dummy node to simplify list handling
        ListNode sentinel = new ListNode(0);
        ListNode tail = sentinel;
        int carryOver = 0;

        // Traverse both lists until done
        while (list1 != null || list2 != null || carryOver != 0) {
            
            // Get current values or 0 if list is exhausted
            int num1 = (list1 != null) ? list1.val : 0;
            int num2 = (list2 != null) ? list2.val : 0;

            // Compute sum and carry
            int total = num1 + num2 + carryOver;
            carryOver = total / 10;

            // Append new node with the unit digit
            tail.next = new ListNode(total % 10);
            tail = tail.next;

            // Move to next nodes if available
            if (list1 != null) list1 = list1.next;
            if (list2 != null) list2 = list2.next;
        }

        // Return result (skip the dummy node)
        return sentinel.next;
    }
}
