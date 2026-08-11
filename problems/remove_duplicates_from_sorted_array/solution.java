/*when array is sorted no need to shift just overwrite them just try to keep distinct elemts in the front*/
class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int i=0;
        int j=0;
        int n = nums.length;
        while(j<n)
        {
            if(nums[i]!=nums[j])
            {
                nums[++i]=nums[j];
            }
            j++;
        }
        return ++i;
    }
}