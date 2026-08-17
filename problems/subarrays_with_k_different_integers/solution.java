class Solution {
    public static int atMost(int[] nums,int k){
        int left=0,count=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int right=0;right<nums.length;right++)
        {
            hm.put(nums[right],hm.getOrDefault(nums[right],0)+1);
            while(hm.size()>k){
                hm.put(nums[left],hm.get(nums[left])-1);
                if(hm.get(nums[left])==0) hm.remove(nums[left]);
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
}