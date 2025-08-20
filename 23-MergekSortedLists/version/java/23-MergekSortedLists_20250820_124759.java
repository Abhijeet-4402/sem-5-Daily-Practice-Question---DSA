// Last updated: 20/8/2025, 12:47:59 pm
/**
* Definition for singly-linked list.
*
*class ListNode {
*    int val;
*    ListNode next;
*    ListNode() {}
*    ListNode(int val) { this.val = val; }
*    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }*/

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if (n == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(new Comparator<>(){
            @Override
            public int compare(ListNode o1, ListNode o2){
                return o1.val - o2.val;
            }
        });
        for (ListNode head : lists){ 
            if(head!=null) {
                pq.add(head);
            }
        }

        if (pq.isEmpty()) return null;

        ListNode head = new ListNode(0);
        ListNode temp = head;
        while (!pq.isEmpty()) {
            ListNode t = pq.poll();
            head.next = t;
            head = head.next;
            if(t.next!=null) pq.add(t.next); 
        }
        return temp.next;
    }
}
