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
    public boolean solve(ListNode slow, ListNode fast ){
        
        if(fast == null || fast.next== null){
            return false;
        }
        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast){
            return true;
        }
        return solve(slow,fast);

        
    }
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        return solve(slow,fast);
        
    }
}