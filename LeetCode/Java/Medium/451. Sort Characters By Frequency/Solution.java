class Solution {
    public String frequencySort(String s) {
        char sChar[] = new char[128];
        int frequency[] = new int[128];
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            frequency[ch]++;
            sChar[ch] = ch;
        }

        int maxFreq = 0;

        for (int i = 0; i < frequency.length; i++) {
            maxFreq = Math.max(maxFreq, frequency[i]);
        }

        for(int freq = maxFreq; freq>=1;freq--){

            for(int i=0;i<frequency.length;i++){

                if(freq==frequency[i]){
                    for(int j=1;j<=freq;j++){
                        sb.append(sChar[i]);
                    }
                    
                }

            }
        }
        return sb.toString();

    }
}