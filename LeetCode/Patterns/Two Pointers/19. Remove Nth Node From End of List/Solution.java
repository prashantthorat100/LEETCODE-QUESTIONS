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
    public void remove(ListNode head, int n){

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode prev = head;

        int size =0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if(size == n){
            head = head.next;
            return head;
        }

        // ListNode temp1 = head;
        // for(int i=0;i<size-n;i++){
        //     temp1 = temp1.next;
        // }
        for(int i=0;i<size-n-1;i++){
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return head;
        
        
    }
}