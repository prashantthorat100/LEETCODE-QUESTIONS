import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> s = new Stack<>();
        // int nge[] = new int[arr.length];
        ArrayList<Integer> nge = new ArrayList<>();
        
        for(int i=arr.length-1;i>=0;i--){
            
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nge.add(-1);
            }
            else{
                nge.add(s.peek());
            }
            s.push(arr[i]);
        }
        Collections.reverse(nge);
        return nge;
    }
}