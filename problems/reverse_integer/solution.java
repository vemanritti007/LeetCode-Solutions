class Solution {
    public int reverse(int x) {
        int sign=1;
        if(x<0)sign=-1;
        long num=(long)x*sign;
        long rev=0;
        while(num>0){
            rev=rev*10 +num%10;
            num=num/10;
        }
        if(rev*sign>Integer.MAX_VALUE || rev*sign<Integer.MIN_VALUE)return 0;
        return (int)rev*sign;
    }
}