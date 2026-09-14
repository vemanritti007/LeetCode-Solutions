class Solution {
    public static int compareChar(String a , String b){
        int la = a.length(),lb=b.length();
        for(int i=0;i<la+lb;i++){
            char ca = (i<la)?a.charAt(i):b.charAt(i-la);
            char cb = (i<lb)?b.charAt(i):a.charAt(i-lb);
            if(ca!=cb) return cb-ca;
        }
        return 0;
    }

    public String largestNumber(int[] nums) {
        String arr[] = new String[nums.length];
        int totallen=0;
        for(int i=0;i<nums.length;i++){
            arr[i] = Integer.toString(nums[i]);
            totallen+=arr[i].length();
        }
        Arrays.sort(arr,Solution::compareChar);
        if(arr[0].charAt(0)=='0') return "0";
        StringBuilder sb = new StringBuilder(totallen);
        for(String s : arr){
            sb.append(s);
        }
        return sb.toString();
    }
}