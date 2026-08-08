import java.lang.Math;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        HashSet<Integer> s = new HashSet<>();
        int n = nums.length;
        for(int i = 0;i<n;i++)
        {
            if(s.contains(nums[i]))return true;
            s.add(nums[i]);
            if(s.size()>k)s.remove(nums[i-k]);
        }
        return false;
    }
}