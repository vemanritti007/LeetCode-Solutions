class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int n : nums1)
        {
            hm.put(n,hm.getOrDefault(n,0)+1);
        } 
        for(int n : nums2)
        {
            if(hm.containsKey(n) && hm.get(n)>0)
            {
                res.add(n);
                hm.put(n,hm.get(n)-1);
            }
        }  
        int ans[] = new int[res.size()];
        int idx=0;
        for(int n : res) {
            ans[idx++]=n;
        }
        return ans;
    }
}