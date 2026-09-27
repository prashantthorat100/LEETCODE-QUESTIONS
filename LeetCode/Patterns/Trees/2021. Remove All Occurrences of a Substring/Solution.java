class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder("");
        sb.append(s);
        while(sb.toString().contains(part)){
            String temp = sb.toString().replaceFirst(part, "");
            sb = new StringBuilder(temp);
            
        }

        return sb.toString();
    }
}