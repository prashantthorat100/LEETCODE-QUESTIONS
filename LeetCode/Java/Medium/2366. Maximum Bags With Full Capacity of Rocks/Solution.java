class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int ratio[][] = new int[rocks.length][2];
        for(int i=0;i<ratio.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = capacity[i]-rocks[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        int maxBags =0;
        for(int i=0;i<ratio.length;i++){
            int idx = ratio[i][0];
            int value = ratio[i][1];
            if( value <= additionalRocks  ){
                rocks[idx]+= value;
                additionalRocks-=value; 
                maxBags++;
            }else{
                break;
            }
        }

        return maxBags;
    }
}