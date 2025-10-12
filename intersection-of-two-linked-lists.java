public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        for (ListNode nodeA = head1; nodeA != null; nodeA = nodeA.next)
            for (ListNode nodeB = head2; nodeB != null; nodeB = nodeB.next)
                if (nodeA == nodeB) return nodeA;
        return null;
    }
}
