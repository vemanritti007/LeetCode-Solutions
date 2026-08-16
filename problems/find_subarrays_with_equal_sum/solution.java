class Solution {
    public boolean findSubarrays(int[] nums) 
    {
        HashSet<Integer> hs = new HashSet<>();
        int sum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            sum=nums[i]+nums[i+1];
            if(hs.contains(sum))return true;
            hs.add(sum);
        }
        return false;
    }
}