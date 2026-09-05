class Solution {
    public int maxArea(int[] height) {
       int left=0,right=height.length-1,maxA=0;
       while(left<right){
        int h = Math.min(height[left],height[right]);
        int w = right-left;
        maxA=Math.max(maxA,w*h);
        if(height[left]>height[right])right--;
        else left++;
       }
    return maxA;
    }
}