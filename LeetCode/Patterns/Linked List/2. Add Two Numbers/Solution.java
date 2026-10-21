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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode ans = new ListNode(0);
        ListNode finAns = new ListNode(-1);
        ListNode LastAns = finAns;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int x =0;
        int y =0;
        int carry=0;
        while(temp1!= null || temp2!=null){
            if(temp1!=null ){
                x = temp1.val;
            }else{
                x = 0;
            }
            if(temp2!=null ){
                y = temp2.val;
            }else{
                y = 0;
            }
            int sum = x + y + carry;

            ListNode ans = new ListNode(sum%10);    
            carry = sum/10;
            
            finAns.next = ans;
            finAns = finAns.next;
            if(temp1 != null){
                temp1 = temp1.next;
            }
            if(temp2!= null){
                temp2 = temp2.next;
            }
            // temp1 = temp1.next;
            // temp2 = temp2.next;
        }

        if(carry>0){
            finAns.next = new ListNode(carry);
        }



        return LastAns.next;
        
    }
}