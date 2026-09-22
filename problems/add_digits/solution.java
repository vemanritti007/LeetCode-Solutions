class Solution {
    public static int[] makenum(int num){
        String s = String.valueOf(num);
        int n = s.length(),i=0;
        int arr[] = new int[n];
        while(num>0){
            arr[i++]=num%10;
            num=num/10;
        }
        return arr;
    }
    public static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public int addDigits(int num) {
        while(num>=10){
            int[] arr = makenum(num);
            num=sum(arr);
        }
        return num;
    }
}