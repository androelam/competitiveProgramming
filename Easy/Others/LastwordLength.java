public class LastwordLength {
 
        public int lengthOfLastWord(String s) {
            String x = s.trim();
            int len = x.length();
            int cnt = 0;
            for(int i = len - 1 ; i >= 0; i--) {
                if(x.charAt(i) == ' ') {
                    return cnt;
                }
                else {
                    cnt++;
                }
            }
            return cnt;
        }
     
}
