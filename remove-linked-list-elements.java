class Solution {
    public ListNode removeElements(ListNode head, int target) {
        // Dummy node simplifies removal (even if head itself needs removal)
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        // Traverse the linked list
        while (head != null) {
            // If current node’s value is not the target, link it to the new list
            if (head.val != target) 
                current = current.next = head;
            head = head.next;
        }

        // End the new list
        current.next = null;

        // Return the filtered list (skipping dummy node)
        return dummy.next;
    }
}
