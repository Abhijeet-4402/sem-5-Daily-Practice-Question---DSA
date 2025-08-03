// Last updated: 4/8/2025, 12:06:30 am
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        ListNode n = node.next;
        node.next = node.next.next;
        n.next = null;
    }
}