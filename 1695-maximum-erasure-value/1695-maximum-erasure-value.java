class Solution {
public int maximumUniqueSubarray(int[] nums) {

    if (nums.length == 1) {
        return nums[0];
    }
    
    int r = 0;
    int l = 0;
    
    HashMap<Integer, Integer> hm = new HashMap<>();
    
    int output = 0;
    int ans = 0;
    
    while (r < nums.length) {
        if (hm.containsKey(nums[r])) {
            ans = Math.max(output, ans);
            int index = hm.get(nums[r]);
            while (l <= index) {
                output -= nums[l];
                l++;
            }
        }

        output += nums[r];
        hm.put(nums[r], r);
        r++;
    }
    
    ans = Math.max(ans, output);
    
    return ans;
}
}