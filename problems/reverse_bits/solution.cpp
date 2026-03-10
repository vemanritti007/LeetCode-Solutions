class Solution {
public:
    int reverseBits(int n) 
    {
        int rev=0,bit;
        for(int i=0;i<32;i++)
        {
            bit=n%2;
            rev=rev*2+bit;
            n=n/2;
        }
        return rev;
    }
};