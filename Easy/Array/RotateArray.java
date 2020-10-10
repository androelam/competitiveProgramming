class RotateArray {
    public void rotate(int[] nums, int k) {
        int numLen = nums.length;
        k = k % numLen;
        rotateArray(nums, 0, numLen - 1);
        rotateArray(nums, 0, k - 1);
        rotateArray(nums, k, numLen - 1);
    }
    public void rotateArray(int[] nums, int start, int end) {
        
        while (start < end) {
            nums[start] ^= nums[end];
            nums[end] ^= nums[start];
            nums[start] ^= nums[end];
            start++;
            end--;
        }
    }
}

