class ReverseString {
    public void reverseString(char[] s) {
        int N = s.length-1;
        int i = 0;
        while(i < N) {
            s[i] ^= s[N];
            s[N] ^= s[i];
            s[i] ^= s[N];
            i++;
            N--;
        }
    }
}
//Reverse string without extra space