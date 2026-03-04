class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int currans=0,ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                currans++;
                if(currans>ans)
                {
                    ans=currans;
                }
            }
            else{
                currans=0;
            }
        }
        return ans;
    }
}