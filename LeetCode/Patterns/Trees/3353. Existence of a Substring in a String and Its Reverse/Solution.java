class Solution {
    public String reverse(String s){
        StringBuilder sb = new StringBuilder();
        int right = s.length()-1;
        while(right>=0){
            sb.append(s.charAt(right));
            right--;
        }
        return sb.toString();

    }
    public boolean isSubstringPresent(String s) {
        String revstring = reverse(s);

        for(int i=0;i<s.length()-1;i++){
            String pair = s.substring(i,i+2);

            if(revstring.contains(pair)){
                return true;
            }

        }
        return false;
    }
}