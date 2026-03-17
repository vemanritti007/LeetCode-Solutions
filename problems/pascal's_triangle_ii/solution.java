class Solution {
    public static int ncr(int n, int r)
    {
        long res = 1;

        for(int i = 1; i <= r; i++)
        {
            res = res * (n - r + i) / i;
        }

        return (int)res;
    }

    public List<Integer> getRow(int rowIndex) 
    {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i <= rowIndex; i++)
        {
            list.add(ncr(rowIndex, i));
        }

        return list;
    }
}