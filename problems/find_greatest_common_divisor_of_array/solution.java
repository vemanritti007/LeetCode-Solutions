class Solution {
    public static int maxEle(int[] nums,int idx)
    {
        if(idx==nums.length-1)return nums[idx];
        return Math.max(nums[idx],maxEle(nums,idx+1));
    }
    public static int minEle(int[] nums,int idx)
    {
        if(idx==nums.length-1)return nums[idx];
        return Math.min(nums[idx],minEle(nums,idx+1));
    }
    public static int gcd(int x,int y)
    {
        int rem=x%y;
        if(rem==0)return y;
        return gcd(y,rem);
    }
    public int findGCD(int[] nums) 
    {
        int x=maxEle(nums,0);
        int y=minEle(nums,0);
        return gcd(x,y);
    }
}