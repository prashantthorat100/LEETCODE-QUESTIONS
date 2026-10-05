class Solution {
    public boolean checkPermutation(String s1, String ans, String s2){
        //base case
        if(s1.length()==0 && s2.contains(ans)){
            return true;
        }
        //recursive case
        for(int i=0;i<s1.length();i++){
            char curr = s1.charAt(i);
            String remainString = s1.substring(0,i)+s1.substring(i+1);
            if(checkPermutation(remainString, ans+curr,s2)){
                return true;
            }   
        }
        return false;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(checkPermutation(s1,"",s2)){
            return true;
        }
        return false;
    }
}