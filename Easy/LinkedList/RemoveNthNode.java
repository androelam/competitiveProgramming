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
class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy_head = new ListNode(0,head);
        ListNode fast_node = dummy_head;
        ListNode slow_node = dummy_head;
      
        for (int i = 0 ; i <= n ; i++) {
            fast_node = fast_node.next;
        }
        while(fast_node != null) {
            fast_node = fast_node.next;
            slow_node = slow_node.next;
        }

        slow_node.next = slow_node.next.next;
        return dummy_head.next;
    }
}