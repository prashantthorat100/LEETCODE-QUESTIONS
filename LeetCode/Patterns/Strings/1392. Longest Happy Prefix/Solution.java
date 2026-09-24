class Solution {
    public String longestPrefix(String s) {
        StringBuilder prefix = new StringBuilder(""); 
        StringBuilder suffix = new StringBuilder(""); 
        String happyPr = "";

        int n = s.length();
        // int idx1=0;
        // int idx2=s.length()-1;
        // while(idx1 < s.length()-1  && idx2>0){

            for(int i=0;i<s.length()-1;i++){
                prefix.append(s.charAt(i));
                suffix.insert(0,s.charAt(n-i-1));
                if(prefix.toString().equals(suffix.toString())) {
                happyPr = prefix.toString();
                }
            }

        return happyPr;
        
    }
}