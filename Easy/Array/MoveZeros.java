class MoveZeros {
    public void moveZeroes(int[] nums) {
        int nonZeroPtr = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            if(nums[i] != 0) {
                nums[nonZeroPtr++] = nums[i];
            }
        }
        for(int j = nonZeroPtr; j < len ; j++) {
            nums[j] = 0;
        }
    }
}