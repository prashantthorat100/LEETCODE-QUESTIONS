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
    static ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static ListNode reverse(ListNode head1){
        ListNode prev= null;
        ListNode curr = head1;
        ListNode next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode mid = getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;

        ListNode leftPart = head;
        ListNode nextLeft = leftPart ;
        ListNode rightPart = reverse(rightHead);
        ListNode nextRight;

        while(leftPart!=null && rightPart!=null){
            nextLeft = leftPart.next;
            leftPart.next = rightPart;

            nextRight = rightPart.next;
            rightPart.next = nextLeft;
            
            leftPart = nextLeft;
            rightPart = nextRight;
        }

    }
}