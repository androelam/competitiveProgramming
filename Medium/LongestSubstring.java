public class LongestSubStringWithoutRepeatingCharacter {  
        public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int ptr1 = 0;
        int ptr2 = 0;
        HashSet<Character> hSet = new HashSet();
           while(ptr2 < s.length()){
            if (!hSet.contains(s.charAt(ptr2))) {
               hSet.add(s.charAt(ptr2));
               ptr2++;
               max = Math.max(max, hSet.size());
           }
            else{
                hSet.remove(s.charAt(ptr1));
                ptr1++;
            } 
           }
          return max;
    }
}
