class Solution {
    public int maxEvents(int[][] events) {
        int act[][] = new int[events.length][3];

        for(int i=0;i<events.length;i++){
            act[i][0] = i;
            act[i][1] = events[i][0];
            act[i][0] = events[i][1];
        }
        int maxEvent = 0;

        // sort basis of end
        Arrays.sort(act, Comparator.comparingDouble(o->o[2]));
        // first event
        maxEvent = 1;
        int lastEnd = act[0][2];
        for(int i=1;i<events.length;i++){
            if(act[i][1]>=lastEnd){
                maxEvent++;
                lastEnd = act[i][2];
            }
        }
        return maxEvent;

        
    }
}