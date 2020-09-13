class ReverseInteger {
    public int reverse(int x) {
        long reverseNum = 0;
        boolean isNegative = false;
        if(x < 0) {
            isNegative = true;
            x *= -1;
        }
        while ( x > 0) {
              reverseNum = reverseNum * 10 + x % 10;
              x = x/10;
        }
        if (reverseNum >= Integer.MAX_VALUE){
            return 0;
        }
        
        return isNegative ? (int)(reverseNum * -1) : (int)(reverseNum);
    }
    
}