class Solution {
    public int balancedStringSplit(String s) 
    {
        int count=0,r=0,l=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            {
                r++;
            }
            else
            {
                l++;
            }
            if(r==l)
            {
                count++;
            }
        } 
        return count;   
    }
}