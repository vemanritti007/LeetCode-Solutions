class Solution {
    public void sortColors(int[] nums) 
    {
            HashMap<Integer,Integer> hm = new HashMap<>();
            int n = nums.length;
            for(int num : nums)
            {
                hm.put(num,hm.getOrDefault(num,0)+1);
            }
            for(int i=0;i<n;i++)
            {
                if(hm.getOrDefault(0,0)>0)
                {
                nums[i]=0;
                hm.put(0,hm.get(0)-1);
                }
                else if(hm.getOrDefault(1,0)>0)
                {
                nums[i]=1;
                hm.put(1,hm.get(1)-1);
                }
                else if(hm.getOrDefault(2,0)>0)
                {
                nums[i]=2;
                hm.put(2,hm.get(2)-1);
                }
            }
    }
}