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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int size =0;
        if(head == null || head.next == null || k == 0){
            return head;
        }
        while(temp!=null){
            size++;
            temp= temp.next;
        }
        temp = head;
        for(int i=0;i<(k%size);i++){
            temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            temp.next.next = head;
            head = temp.next;
            temp.next = null;

            // ListNode last = temp.next;
            // last.next = head;
            // head = last;
            // temp.next = null;
        }

        return head;
    }
}