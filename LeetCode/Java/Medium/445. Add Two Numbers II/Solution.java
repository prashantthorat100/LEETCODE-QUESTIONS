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
        ListNode curr1 = l1;
        ListNode prev1 = null;
        ListNode next1;

        while(curr1!=null){
            next1 = curr1.next;
            curr1.next = prev1;
            prev1 = curr1;
            curr1 = next1;
        }
        ListNode curr2 = l2;
        ListNode prev2 = null;
        ListNode next2;

        while(curr2!=null){
            next2 = curr2.next;
            curr2.next = prev2;
            prev2 = curr2;
            curr2 = next2;
        }

        ListNode temp1 = prev1;
        ListNode temp2 = prev2;
        
        ListNode finAns = new ListNode(-1);
        ListNode ans1 = finAns;
        int carry = 0;
        int x=0;
        int y=0;
        int sum=0;

        while(temp1!=null || temp2!=null){
            if(temp1==null){
                x = 0;
            }else{
                x = temp1.val;
            }
            if(temp2==null){
                y = 0;
            }else{
                y = temp2.val;
            }
            sum = x + y + carry;
            ListNode ans = new ListNode(sum%10);
            carry = sum / 10;
            if(temp1!=null){
                temp1= temp1.next; 
            }
            if(temp2!=null){
                temp2= temp2.next; 
            }
            finAns.next = ans;
            finAns = finAns.next;
        }
        if(carry>0){
            ListNode ans = new ListNode(carry);
            finAns.next = ans;
            finAns = finAns.next;
        }


        ListNode curr3 = ans1.next;
        ListNode prev3 = null;
        ListNode next3;

        while(curr3!=null){
            next3 = curr3.next;
            curr3.next = prev3;
            prev3 = curr3;
            curr3 = next3;
        }
        return finAns;   
    }
}