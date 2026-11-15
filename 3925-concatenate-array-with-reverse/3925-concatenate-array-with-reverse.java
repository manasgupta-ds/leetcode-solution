class Solution {
    public int[] concatWithReverse(int[] nums) 
    {
        int l=nums.length;
        int ans[]=new int[2*l];
        int j=l;
        for(int i=0;i<ans.length;i++)
        {
            if(i<l)
            ans[i]=nums[i];
            else
            ans[i]=nums[--l];
        }
        return ans;
    }
}