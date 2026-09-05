class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      if(nums1.length>nums2.length) return intersection(nums2,nums1);
      boolean seen[] = new boolean[1001];
      HashSet<Integer> hs = new HashSet<>();
      for(int n : nums1){
        seen[n]=true;
      }
      for(int n : nums2){
        if(seen[n])hs.add(n);
      }
      int k=0;
      int ans[] = new int[hs.size()];
      for(int n : hs){
        ans[k++]=n;
      }
      return ans;
    }
}