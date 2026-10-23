class Pair {
    char ch;
    int index;

    Pair(char ch, int index) {
        this.ch = ch;
        this.index = index;
    }
}
class Solution {
    public int firstUniqChar(String s) {
        Queue<Pair> q= new LinkedList<>();
        int freq[] = new int[26];
        int ans = -1;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
            q.add(new Pair(ch,i));
            while(!q.isEmpty() && freq[q.peek().ch-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                ans = -1;
            }else{
                ans = q.peek().index;
            }

        }
        return ans;
    }
}