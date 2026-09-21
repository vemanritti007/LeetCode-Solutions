class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)return 0;
        int i=0,sign=1;
        long result=0;
        if(s.charAt(0)=='-'){
            i++;
            sign=-1;
        }
        else if(s.charAt(0)=='+')i++;
        while(i<s.length()){
            char curr = s.charAt(i);
            if(curr<'0' || curr>'9')break;
            result = result*10 + (curr-'0');
            if(result*sign<Integer.MIN_VALUE)return Integer.MIN_VALUE;
            if(result*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        return (int)(sign*result);
    }
}