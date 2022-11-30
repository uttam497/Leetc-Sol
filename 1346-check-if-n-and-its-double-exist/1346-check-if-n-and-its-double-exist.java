class Solution {
    public boolean checkIfExist(int[] arr) {
        
        for(int i=arr.length-1;i>=0;i--)
        {
            int a=2*arr[i];
            for(int j=0;j<arr.length;j++)
            {
                if(a==arr[j]&&j!=i)
                {
                    return true;
                }
            }
        }
    
            return false;
        
    }
}