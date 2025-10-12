class Solution {
    public ListNode reverseList(ListNode start) {
        ListNode reversed = null; // Points to the new head after reversal

        while (start != null) {
            ListNode next = start.next; // Store next node
            start.next = reversed;      // Reverse the link
            reversed = start;           // Move reversed pointer forward
            start = next;               // Move start pointer forward
        }

        return reversed; // Return new head
    }
}
