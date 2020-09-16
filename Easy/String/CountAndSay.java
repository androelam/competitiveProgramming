class CountAndSay {
    public String countAndSay(int n) {
        if(n == 0){
            return "";
        }
        String result = "1";
        
        while (n > 1) { 
           
            StringBuilder cur = new StringBuilder();
            for(int j = 0; j < result.length(); ++j){
                int count = 1;
                while( j+1 < result.length() && result.charAt(j) == result.charAt(j+1)){
                    count++;
                    j++;
                }
                cur.append(count).append(result.charAt(j));
            }
            result = cur.toString();
            
            n--;
        }
        return result;
    }
}