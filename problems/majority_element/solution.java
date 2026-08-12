class Solution {
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int majority=Integer.MIN_VALUE;
        int curr=1;
        int ele=nums[0];
        for(int n : nums)
        {
            hm.put(n,hm.getOrDefault(n,0)+1);
            curr=hm.get(n);
            if(curr>majority)
            {
                majority=Math.max(curr,majority);
                ele=n;
            }
        } 
        return ele;   
    }
}