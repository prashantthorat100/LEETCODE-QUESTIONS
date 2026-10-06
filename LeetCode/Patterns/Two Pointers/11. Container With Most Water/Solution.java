class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int h = -1;
        int width = 0;
        int maxWater = 0;
        while(left<right){
            h = Math.min(height[left],height[right]);
            width = right-left;
            maxWater = Math.max(maxWater,(h*width));
            if(left<right){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}