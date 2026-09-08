class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        boolean found=false;
        int b=0;
        boolean un=false;
        int arr[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int a=nums1[i];
            for(int j=0;j<nums2.length;j++)
            {
               
                if(j+1<nums2.length)
                {
                    if(a==nums2[j])
                    {
                        un=true;
                        b=a;
                    }
                    if(b<nums2[j+1]&&un)
                    {
                    arr[i]=nums2[j+1];
                    found=true;
                    System.out.println(arr[i]+"under");
                    break;
                    }
                    }
                    
                }
                
                if(found==true)
                {
                    System.out.println("Manas");
                    found=false;
                    System.out.println(arr[i]+"foundf");

                }
                else
                {
                arr[i]=-1;
                System.out.println("Not found");
                System.out.println(arr[i]+" NOt");
                }
                un=false;
        }
            
        
        return arr;
    }
}