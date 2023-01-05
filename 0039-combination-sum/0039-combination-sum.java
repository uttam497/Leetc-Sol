class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> ans=new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
        
    }
    private void findCombination(int ind,int ar[],int target,List<List<Integer>> ans,List<Integer> ds)
    {
        if(ind==ar.length){
            if(target==0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(ar[ind]<=target)
        {
            ds.add(ar[ind]);
            findCombination(ind,ar,target-ar[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
         findCombination(ind+1,ar,target,ans,ds);
    }
}