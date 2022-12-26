class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=1;i<=n;i++)
            list.add(i);
        int  ind=0;
        return solve(list,k-1,ind,n);
        
    }
    public int solve(ArrayList<Integer> list,int k,int index,int n)
    {
        if(list.size()==1)
            return list.get(0); 
            index=((index+k)%(list.size()));
        list.remove(index);
       
       int ans= solve(list,k,index,n--);
        return ans;
    }
}


// class Solution {
//     public int findTheWinner(int n, int k) {
//         ArrayList<Integer> al=new ArrayList<>();
//         for(int i=1;i<=n;i++) al.add(i);
//         int index=0;
//         while(al.size()>1){
//             index=(index+k-1)%(al.size());
//             al.remove(index);
//         }
//         return al.get(0);
//     }
// }