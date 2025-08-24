/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode m = head;
        ListNode k= head;

        while (m != null && m.next != null) {
            m = m.next.next;
            k = k.next;

            if (m == k) {
                return true;
            }
        }

        return false;        
    }
}