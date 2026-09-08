class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        int j=0;
        int count = 0;
        for(int i=s.length()-1;i>=0;i--){

            while(i>=0 &&s.charAt(i)!=' '){
                
                    sb.insert(j,s.charAt(i));
                    i--;
                    count++;
            }

            if( i>=0 && count != 0 && s.charAt(i+1)!=' '){
                sb.insert(count, ' ');
                j = count+1;
                count++;
            }
            
        }
        return sb.toString().trim();
    }
}