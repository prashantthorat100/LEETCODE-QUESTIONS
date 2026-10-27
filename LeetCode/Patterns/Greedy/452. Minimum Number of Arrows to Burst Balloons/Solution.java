// import java.utils.*;
class Solution {
    public int findMinArrowShots(int[][] points) {
        // Arrays.sort(points, Comparator.doubleComparing(o-> o(1)));
        Arrays.sort(points, Comparator.comparingDouble(o->o[1]));

        int maxArrow = 0;

        // burst first
        maxArrow = 1;
        int endPoint = points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]<=endPoint){
                continue;
            }else{
                maxArrow++;
                endPoint = points[i][1];
            }
        }
        return maxArrow;
    }
}