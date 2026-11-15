class Solution {
    public int[] findDegrees(int[][] matrix)
     {
        int l=matrix.length;
        int n[]=new int[l];
        for(int i=0;i<l;i++)
        {
            int sum=0;
            for(int j=0;j<l;j++)
            {
                if(matrix[i][j]==1)
                sum+=matrix[i][j];

            }
            n[i]=sum;
        }
        return n;
    }
}