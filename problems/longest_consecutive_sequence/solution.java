class Solution {
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> hs = new HashSet<>();
        if(nums.length==0)return 0;
        int longest=1;
        for(int n : nums)
        {
            hs.add(n);
        }   
        for(int n:hs)
        {
            if(hs.contains(n-1))continue;
            else {
                int i=1,Currcount=1;
                while(hs.contains(n+i))
                {   
                    i++;
                    Currcount++;
                }
                 longest=Math.max(Currcount,longest);
            }
        }
    return longest;
    }
}