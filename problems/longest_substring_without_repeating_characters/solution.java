class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] a = new boolean[128];
        int right=0,left=0,max=0;
        while(right<s.length()){
            if(!a[s.charAt(right)]){
                a[s.charAt(right)]=true;
                max=Math.max(max,right-left+1);
                right++;
            }
            else{
                a[s.charAt(left)]=false;
                left++;
            }
        }
        return max;
    }
}