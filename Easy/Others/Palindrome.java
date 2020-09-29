class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0 ) {
            return true;
        }
        if ( x < 0 ){
            return false;
        }
        int num = x;
        int rev_num = 0;
        while ( x > 0 ){
            rev_num = rev_num * 10 + x % 10;
            x /= 10;
        }
        return ( rev_num == num );
    }
}