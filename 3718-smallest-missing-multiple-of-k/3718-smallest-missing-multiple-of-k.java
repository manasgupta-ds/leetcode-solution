class Solution {
    public int missingMultiple(int[] nums, int k) 
    {
        int l=k;
        int j=2;
        while(true)
        {
            boolean found=false;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==l)
                {
                    found=true;
                
                }
            }
            if(found)
            {
                l=k*j;
                j++;
            }
            else
            {
                break;
            }
            
        }
        return l;
        
    }
}