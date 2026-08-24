class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int left=0,count=0,currSum=0;
        hm.put(0,1);
        for(int n : nums){
            currSum+=n;
            if(hm.containsKey(currSum-k))count+=hm.get(currSum-k);
            hm.put(currSum,hm.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}