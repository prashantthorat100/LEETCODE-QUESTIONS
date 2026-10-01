class Solution {
    public boolean numOfBouquet(int bloomDay[], int day, int m, int k){
        int count =0;
        int nOfB = 0;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=day){
                    count++;

                }

                else{
                    nOfB = nOfB + (count/k);
                    count =0;
                }
            }
            nOfB+= count/k;
            if(nOfB>=m){
                return true;
            }
            return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length){
            return -1;
        }

        int minDay = Integer.MAX_VALUE;
        
        int maxDay = Integer.MIN_VALUE;
        
        for(int i=0;i<bloomDay.length;i++){
            minDay = Math.min(minDay,bloomDay[i]);
            maxDay = Math.max(maxDay,bloomDay[i]);
        }
        

        
        while(minDay<=maxDay){
            int midDay = minDay + (maxDay-minDay)/2;
            if(numOfBouquet(bloomDay, midDay, m, k)){
                maxDay = midDay-1;
            }
            else{
                minDay = midDay+1;
            }

        }    
        return minDay;
    }
}