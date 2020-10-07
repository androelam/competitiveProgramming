public class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if(len == 0 ) {
            return 0;
        }
        int prev = 0;
        for(int i = 0 ; i < len; i++ ){
            if(target > nums[i] && target > prev) {
                prev = nums[i];
            }
            else {
                return i;
            }
            
        }
        return (len > 0)? len : 0;
   
    }
}class SearchInsert {
    
}
