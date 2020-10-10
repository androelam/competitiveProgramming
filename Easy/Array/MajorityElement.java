class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            if(map.containsKey(num) && map.get(num) > (nums.length / 2)){
                return num;
            }
            else {
                map.put(num, map.getOrDefault(num, 1) + 1);
            }
        }
        return -1;
    }
}