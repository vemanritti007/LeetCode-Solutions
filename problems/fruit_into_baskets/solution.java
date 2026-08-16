class Solution {
    public int totalFruit(int[] fruits) 
    {
        int left=0,distinct=2;
        int max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int right=0;right<fruits.length;right++)
        {
           hm.put(fruits[right],hm.getOrDefault(fruits[right],0)+1);
           while(hm.size()>2)
           {
            hm.put(fruits[left],hm.get(fruits[left])-1);
            if(hm.get(fruits[left])==0)
            {
                hm.remove(fruits[left]);
            }
            left++;
           }
           max=Math.max(max,right-left+1);
        } 
        return max;      
    }
}