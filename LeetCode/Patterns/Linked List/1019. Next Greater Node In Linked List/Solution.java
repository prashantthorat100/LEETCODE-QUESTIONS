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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        int n = list.size();
        int ans[] = new int[n];

        Stack<Integer> s = new Stack<>();
    
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<= list.get(i)){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i] = 0;

            }else{
                ans[i] = s.peek();
            }

            s.push(list.get(i));

        }
        
        return ans;
    }
}