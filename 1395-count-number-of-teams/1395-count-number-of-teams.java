class Solution {
    public int numTeams(int[] rating) {
        int res = 0;
        for (int i = 1; i < rating.length - 1; i++) {
            int leftGreater = 0, leftLess = 0;
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) {
                    leftLess++;
                } else if (rating[j] > rating[i]) {
                    leftGreater++;
                }
            }
            
            int rightGreater = 0, rightLess = 0;
            for (int k = i + 1; k < rating.length; k++) {
                if (rating[k] < rating[i]) {
                    rightLess++;
                } else if (rating[k] > rating[i]) {
                    rightGreater++;
                }
            }
            res = res + leftGreater * rightLess + leftLess * rightGreater;
        }
        return res;
    }
}