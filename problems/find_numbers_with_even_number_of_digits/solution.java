class Solution {
    public static int counting(int x)
    {
        int c=0;
        while(x!=0)
        {
            x=x/10;
            c++;
        }
        return c;
    }
    public int findNumbers(int[] nums) 
    {
        int freq=0;
        for(int i=0;i<nums.length;i++)
        {
            if(counting(nums[i])%2==0)
            {
                freq++;
            }
        }
        return freq;
    }
}