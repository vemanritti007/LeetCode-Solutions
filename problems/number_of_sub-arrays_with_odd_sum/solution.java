class Solution {
    public int numOfSubarrays(int[] arr) {
        int even=1,odd=0;
        long sum=0,count=0;
        for(int n : arr){
            sum+=n;
            if(sum%2==1){
                count+=even;
                odd++;
            }
            else{
                count+=odd;
                even++;
            }
        }
        return (int)(count % 1000000007);
    }
}