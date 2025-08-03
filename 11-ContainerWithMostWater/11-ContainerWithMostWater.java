// Last updated: 4/8/2025, 12:09:18 am
class Solution {
    public int maxArea(int[] height) {
        int max_area= 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                max_area = Math.max(max_area , height[left] * (right - left));
                left++;
            } else {
                max_area = Math.max(max_area , height[right] * (right - left));
                right--;
            }
        }
        return max_area;
    }
}