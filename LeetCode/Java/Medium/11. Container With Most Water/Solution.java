class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int width=0;
        int maxWater = 0;
        int minHeight=0;
        int area =0;
        while(left<right){
            if(height[left]<=height[right]){
                minHeight = Math.min(height[left],height[right]);
                width =right-left;
                area = minHeight*width;
                maxWater = Math.max(maxWater,area);
                left++;
            }
            else if(height[left]>=height[right]){
                minHeight = Math.min(height[left],height[right]);
                width =right-left;
                area = minHeight*width;
                maxWater = Math.max(maxWater,area);
                right--;
            }

        }
        return maxWater;
    }
}