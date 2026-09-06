//kadanes algorithm if upon adding current element makes the sum 0 then ignore that subarray and start a fresh one.
class Solution {
    public int maxSubArray(int[] nums) {
        int currS=0,sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currS+=nums[i];
            sum = (currS>sum)?currS:sum;
            currS=(currS>0)?currS:0;
        }
        return sum;
    }
}