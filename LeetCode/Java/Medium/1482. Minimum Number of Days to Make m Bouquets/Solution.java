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
        

        for(int i= minDay;i<=maxDay;i++){
            if(numOfBouquet(bloomDay,i,m,k)==true){
                return i;
            }
           
        }
            
        return -1;
    }
}