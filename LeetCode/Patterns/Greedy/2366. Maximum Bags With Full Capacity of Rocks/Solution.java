class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        // int diff[][] = new int[rocks.length][2];
        int diff[] = new int[rocks.length];
        for(int i=0;i<diff.length;i++){
            
            diff[i] = capacity[i]-rocks[i];
        }

        Arrays.sort(diff);

        int maxBags =0;
        for(int i=0;i<diff.length;i++){
            int value = diff[i];
            if( value <= additionalRocks  ){
                rocks[i]+= value;
                additionalRocks-=value; 
                maxBags++;
            }else{
                break;
            }
        }

        return maxBags;
    }
}