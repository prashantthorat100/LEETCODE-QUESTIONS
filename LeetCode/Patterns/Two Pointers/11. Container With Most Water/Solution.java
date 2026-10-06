class Solution {
    public int maxArea(int[] height) {
        // int left = 0;
        // int right = left+1;
        int h = -1;
        int width = 0;
        int maxWater = 0;
        for(int left=0;left<height.length-1;left++){
            for(int right=left+1 ;right<height.length;right++){
                h = Math.min(height[left],height[right]);
                width = right-left;
                maxWater = Math.max(maxWater,(h*width));
            }
        }
        return maxWater;
    }
}