//just count all the non overlapping first and return n - count as non overlapping in this question means that 1 2 2 3 is non overlapping
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[1],b[1]));
        int prev = 0,count=1;//count keeps track of non overlapping as first arrays is non overlapping with itself
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=intervals[prev][1]){
                prev=i;
                count++;
            }
        }
        return intervals.length - count;
    }
}