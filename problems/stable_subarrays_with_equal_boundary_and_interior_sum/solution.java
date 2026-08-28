//Dont include the current elemnt in the prefix sum as we need the sum to stop before the current,outer map stores the current right number if it already exist as left in hashmap we find the frequency of pre-right
class Solution {
    public long countStableSubarrays(int[] capacity) {
        Map<Integer,Map<Long,Long>> outer = new HashMap<>();
        long res=0,sum=0;
        for(int right=0;right<capacity.length;right++){
            int currR=capacity[right];
            Map<Long,Long> inner = outer.computeIfAbsent(currR,k-> new HashMap<>());
            res+=inner.getOrDefault(sum-currR,0L);
            sum+=currR;
            inner.put(sum,inner.getOrDefault(sum,0L)+1L);
            if(currR==0 && right>0 && capacity[right-1]==0)--res;
        }
        return res;
    }
}