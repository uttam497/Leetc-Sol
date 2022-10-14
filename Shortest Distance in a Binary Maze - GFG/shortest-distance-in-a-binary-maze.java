//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            int[] source = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                source[i] = x;
            }
            int[] dest = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                dest[i] = x;
            }
            Solution ob = new Solution();
            int ans = ob.shortestPath(grid, source, dest);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    
int[][] dir = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    int shortestPathBinaryMatrix(int i, int j, int x, int y, int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visit = new boolean[n][m];
        visit[i][j] = true;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});

        int res = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            while (size-- > 0) {
                int[] cur = q.remove();

                if (cur[0] == x && cur[1] == y) {
                    return res ;
                }

                for (int ind = 0; ind < dir.length; ind++) {
                    int nextX = dir[ind][0] + cur[0];
                    int nextY = dir[ind][1] + cur[1];

                    if ((nextX >= 0 && nextX < n && nextY >= 0 && nextY < m)
                            && !visit[nextX][nextY] && grid[nextX][nextY] == 1) {

                        q.add(new int[]{nextX, nextY});

                        visit[nextX][nextY] = true;
                    }
                }
            }
            res++;
        }
        return -1;
    }

    int shortestPath(int[][] grid, int[] src, int[] des) {

        return shortestPathBinaryMatrix(src[0], src[1], des[0], des[1], grid);
    }
}