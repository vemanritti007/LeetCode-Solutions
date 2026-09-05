class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        if(nums1.length>nums2.length) return intersect(nums2,nums1);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n : nums1)
        {
            hm.put(n,hm.getOrDefault(n,0)+1);
        } 
        int k = 0;
        for(int n : nums2)
        {
            Integer count = hm.get(n);
            if(count!=null && count>0)
            {
                nums1[k++]=n;
                hm.put(n,count-1);
            }
        }  
        return Arrays.copyOfRange(nums1,0,k);
    }
}