class Solution {
    public int maximumPopulation(int[][] logs) {
        int year[] = new int[logs.length];
        int freq[] = new int[logs.length];

        for(int i=0;i<logs.length;i++){
            year[i] = logs[i][0];
            for(int j=0;j<logs.length;j++){
                if(logs[j][0]<=year[i] && year[i]<logs[j][1]){
                freq[i]++;
                }
            }
        }
        int maxidx = 0;
        int max = freq[0];
        for(int i =1;i<freq.length;i++){
            if(max<=freq[i]){
                max = freq[i];
                // if(year[maxidx]>year[i]){
                    maxidx = i;
                }

            }
        }
        
        return year[maxidx];

    }
}