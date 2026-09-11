class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1],i=0;
        while(i<intervals.length && intervals[i][1]<start){
            ans.add(intervals[i]);
            i++;
        }
            while(i<intervals.length){
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];
            if(currStart<=end){
                end =Math.max(end,currEnd);
                start = Math.min(start,currStart);
            }
            else break;
            i++;
        }
        ans.add(new int[]{start,end});
        while(i<intervals.length){
            ans.add(intervals[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}