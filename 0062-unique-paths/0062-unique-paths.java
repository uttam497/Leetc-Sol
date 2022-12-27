class Solution {
    public int uniquePaths(int m, int n) {
        int track[][]=new int[m][n];
        int i=0;
        for(i=0;i<m;i++)
        {
            track[i][0]=1;
        }
        for(i=0;i<n;i++)
        {
            track[0][i]=1;
        }
        for(i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                track[i][j]=track[i-1][j]+track[i][j-1];
            }
        }
        return track[m-1][n-1];
    }
}