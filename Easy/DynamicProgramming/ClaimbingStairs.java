class Solution {
    public int climbStairs(int n) {
        int[] bottomUp = new int[n+1];
        bottomUp[0] = 1;
        bottomUp[1] = 1;
        for(int i = 2 ; i <= n ; i++) {
            bottomUp[i] = bottomUp[i-1] + bottomUp[i-2];
        }
        return bottomUp[n];
    }
}