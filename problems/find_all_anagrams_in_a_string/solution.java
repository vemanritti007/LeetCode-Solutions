class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Character,Integer> sm = new HashMap<>();
        HashMap<Character,Integer> pm = new HashMap<>();
        for(char c : p.toCharArray())
        {
            pm.put(c,pm.getOrDefault(c,0)+1);
        }
        int left=0,count=p.length();
        for(int right=0;right<s.length();right++)
        {
            char c = s.charAt(right);
            sm.put(c,sm.getOrDefault(c,0)+1);
            if(pm.containsKey(c) && sm.get(c)<=pm.get(c))count--;
            if(right-left+1>p.length()){
                char lc = s.charAt(left);
                if(pm.containsKey(lc) && sm.get(lc)<=pm.get(lc))count++;
                sm.put(lc,sm.get(lc)-1);
                left++;
            }
            if(count==0)ans.add(left);
        }
        return ans;
    }
}