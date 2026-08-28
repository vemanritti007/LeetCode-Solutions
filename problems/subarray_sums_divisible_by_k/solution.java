//similar to continious subarray make remainders within [0,k]therfore for - nums value add k
//either use a hashmap or array as only k remianders better to use arrays as it eleminates collision handling
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefix[] = new int[k];
        int sum=0,count=0;
        prefix[0]=1;
        for(int i=0;i<nums.length;i++){
            sum=(sum+nums[i]%k+k)%k;
            count+=prefix[sum]++;
        }
        return count;
    }
}