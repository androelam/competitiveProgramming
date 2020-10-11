class MaxConsecutiveOnes {
        public int findMaxConsecutiveOnes(int[] nums) {
            int maxCon = 0;
            int conOne = 0;
            for(int i = 0 ; i < nums.length; i++) {
                if(nums[i] == 1) {
                    conOne += 1;
                    maxCon = Math.max(maxCon, conOne);
                }
                else{
                    conOne = 0;
                }
            }
            return maxCon;
        }
    
}
