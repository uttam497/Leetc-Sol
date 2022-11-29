class Solution {
    public int nthUglyNumber(int n) {
        
        // Since this is a dp problem start creating an array:
        int arr[]=new int[n+1];
        arr[1] = 1;
        // Initialize with 1 <--> arr[1]
        
        int ptr2 = 1, ptr3 = 1, ptr5 = 1;
        // Three Pointer's (prime factors 2, 3, 5)
        //  Temp variable
        int t;
        
        for(int i = 2; i < n+1; i++){
            // Each time we multiply the ptrs and find the minimum value 
            t = Math.min(arr[ptr2]*2, Math.min(arr[ptr3]*3, arr[ptr5]*5));
            arr[i] = t;
            
            // Accordingly we increase the ptr
            if(arr[i] == arr[ptr2]*2){
                ptr2++;
            }
            if(arr[i] == arr[ptr3]*3){
                ptr3++;
            }
            if(arr[i] == arr[ptr5]*5){
                ptr5++;
            }
        }
        return arr[n];
    
    }
    
    // check the note
}