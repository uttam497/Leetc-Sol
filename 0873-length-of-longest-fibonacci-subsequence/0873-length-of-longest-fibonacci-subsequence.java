class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int count=0;
        int n=arr.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],i);
        }int temp=0;
        for(int i=0;i<n-2;i++){
           for(int j=i+1;j<n-1;j++){
            int sum=2;
            int first=arr[i];
            int second=arr[j];
            while(mp.containsKey(first+second)){
                     sum++;
                     int third=first+second;
                     first=second;
                     second=third;
                    
                }temp=Math.max(temp,sum);
            }
        }
        return temp>=3?temp:0;
    }
}