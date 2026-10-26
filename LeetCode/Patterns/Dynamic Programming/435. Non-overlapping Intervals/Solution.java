class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        
        int interval[][] = new int[intervals.length][3];


        
        for(int i=0;i<intervals.length;i++){
            interval[i][0]= i;
            interval[i][1]= intervals[i][0];
            interval[i][2]= intervals[i][1];
        }
        
        int maxAct = 0;

        // end sort 
        Arrays.sort(interval, Comparator.comparingDouble(o->o[2]));

        // add 1st activity
        maxAct =1;
        int lastEnd = interval[0][2];
        for(int i=1;i< intervals.length;i++){
            if(interval[i][1] >= lastEnd){
                maxAct++;
                lastEnd = interval[i][2];
            }
        }
        return intervals.length-maxAct;
    }
}