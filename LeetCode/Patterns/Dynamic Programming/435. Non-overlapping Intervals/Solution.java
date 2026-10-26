class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        ArrayList<Integer> start = new ArrayList<>();
        ArrayList<Integer> end = new ArrayList<>();

        for(int i=0;i<intervals.length;i++){
            start.add(intervals[i][0]);
            end.add(intervals[i][1]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 0;

        // end sort 
        end.sort(null);
        // start.sort(null);

        // add 1st activity
        ans.add(0);
        maxAct =1;

        for(int i=1;i<end.size();i++){
            if(start.get(i)>=end.get(i-1)){
                maxAct++;
                ans.add(i);
            }
        }
        return n-maxAct;
    }
}