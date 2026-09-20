class Solution {
    public int maxScore(String s) {
        StringBuilder left = new StringBuilder("");
        StringBuilder right = new StringBuilder("");
        int maxScore = Integer.MIN_VALUE;
        int score = 0;

        for(int i=1;i<s.length();i++){
            score = 0;
            left.append(s.substring(0,i));
            
            right.append(s.substring(i,s.length()));
            
            for(int a=0;a<left.length();a++){
                if(left.charAt(a)-'0' == 0){
                    score++;
                }
            }
            for(int b=0;b<right.length();b++){
                if(right.charAt(b)-'0' == 1){
                    score++;
                }
            }
            maxScore = Math.max(maxScore, score);
            left.setLength(0);   
            right.setLength(0);   
        }


        return maxScore;
    }
}