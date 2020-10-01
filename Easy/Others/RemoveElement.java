public class RemoveElement {
    
        public int removeElement(int[] nums, int val) {
            int ind = 0;
            for(int curr: nums) {
                if(curr != val) {
                    nums[ind++] = curr;
                }
            }
            
            return ind;
        }
    
}
