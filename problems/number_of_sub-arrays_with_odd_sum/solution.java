class Solution {
    public int numOfSubarrays(int[] arr) {
    long count = 0, currSum = 0, n = arr.length;
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);
    map.put(1,0);
    for (int i = 0; i < n; i++) {
        currSum += arr[i];
        int parity = (int)((currSum % 2 + 2) % 2);
        count += map.get(parity);
        map.put(parity, map.get(parity) + 1);
    }
    return (int)(((n * (n + 1)) / 2 - count) % 1000000007);
}
}