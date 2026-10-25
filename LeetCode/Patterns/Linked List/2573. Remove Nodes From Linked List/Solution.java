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
    public ListNode removeNodes(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }   

        ListNode newNode = new ListNode(prev.val);
        newNode.next = null;
        // int maxVal = newNode.val;
        curr = prev.next;
        while(curr!=null){    
            if(curr.val >= newNode.val){
                ListNode node = new ListNode(curr.val);
                node.next = newNode;
                newNode = node;
                
            }
            curr = curr.next;
        }
        return newNode;

    }

}