class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int right = 1;
        int maxLen = 0;
        int idx = 0;
        for(right=1;right<s.length();right++){
            idx =left;
            while(right<=s.length()-1 &&idx<right){
                if(s.charAt(idx)==s.charAt(right)){
                    // maxLen = Math.max(maxLen, right-left+1);
                    left = idx+1;
                    break;
                }
                idx++;
                
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}