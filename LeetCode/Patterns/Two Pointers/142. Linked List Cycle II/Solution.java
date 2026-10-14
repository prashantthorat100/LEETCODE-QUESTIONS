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
    static ListNode solve(ListNode slow, ListNode fast,ListNode head){
        int isExist = 0 ;//notexist
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isExist = 1;
                break;
            }
        }
        if(isExist ==0){
            return null;
        }
        slow = head;
        // ListNode prev = null;
        // int index =0;
        while(slow!= fast){
            // prev= fast;
            slow = slow.next;
            fast = fast.next;
            // index++;

        }
        return slow;
    }
    public ListNode detectCycle(ListNode head) {
        return solve(head,head,head);
    }
}