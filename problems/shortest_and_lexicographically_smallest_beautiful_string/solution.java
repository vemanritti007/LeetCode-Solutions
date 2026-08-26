class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length(),count=0,left=0;
        String best = "";
        for(int right=0;right<n;right++){
            if(s.charAt(right)=='1')count++;
            while(count>k){
                if(s.charAt(left)=='1')count--;
                left++;
            }
            if(count==k){
                while(left<right && s.charAt(left)=='0'){
                    left++;
                }
                String curr = s.substring(left,right+1);
                if(best.length()==0 || best.length()>curr.length() || (best.length()==curr.length() && curr.compareTo(best)<0)){
                    best=curr;
                }
            }
        }
        return best;
    }
}