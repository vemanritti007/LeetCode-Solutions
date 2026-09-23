class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len=0,n=s.length();
        int i=1;
        int[] lps = new int[s.length()];
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else if(len>0){
                len=lps[len-1];
            }
            else{
                lps[i]=0;
                i++;
            }
        }
        return lps[n-1]>0 && n%(n-lps[n-1])==0;
    }
}