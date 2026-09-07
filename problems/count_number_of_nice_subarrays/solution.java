class Solution {
    public static int atMost(int[] nums,int k){
        int left=0,count=0,no=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2!=0)count++;
            while(count>k){
                if(nums[left]%2!=0)count--;
                left++;
            }
            no+=right-left+1;
        }
        return no;
    }
    public int numberOfSubarrays(int[] nums, int k) {
       return atMost(nums,k)-atMost(nums,k-1);
    }
}