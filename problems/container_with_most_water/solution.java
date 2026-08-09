/*class Solution {
    public int maxArea(int[] height) 
    {
        int maxA=-1;
        int i =0;
        int j =height.length-1;
        while(i<j)
        {
            int currA=1;
            if(height[i]<=height[j])
            {
                currA=Math.abs(i-j)*height[i];
                i++;
                maxA=Math.max(maxA,currA);
            }
            else 
            {
                currA=Math.abs(i-j)*height[j];
                j--;
                maxA=Math.max(maxA,currA);
            }
        }   
        return maxA;
    }
}
*/
class Solution{
    public int maxArea(int[] height)
    {
        int i=0;
        int j=height.length-1;
        int maxA=0;
        while(i<j)
        {
            int w = j-i;
            int h = Math.min(height[i],height[j]);
            int area = h*w;
            maxA = Math.max(area,maxA);
            while(i<j && h>=height[i]) i++;
            while(i<j && h>=height[j]) j--;
        }
        return maxA;
    }
}