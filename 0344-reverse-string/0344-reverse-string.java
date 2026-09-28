class Solution {
    public void reverseString(char[] s) 
    {
        int left=0;
        int right=s.length-1;
        while(left<right)
        {
            char rev=s[left];
            s[left]=s[right];
            s[right]=rev;
            left++;
            right--;
        }
        
    }
}