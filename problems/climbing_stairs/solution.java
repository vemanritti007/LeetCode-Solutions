class Solution {
    public int climbStairs(int n) 
    {
        int curr=0;
        int prev1=0,prev2=1;
        if(n<=2) return n;
        else
        for(int i=0;i<n;i++)
        {
            curr=prev1+prev2;
            prev1=prev2;
            prev2=curr;
        }
        return curr;
    }
}