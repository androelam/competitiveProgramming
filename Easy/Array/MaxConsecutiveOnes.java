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

// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int max = 0;
//         int count = 0;
//          for( int num : nums){
//               if(num == 0) {
//                  if(count>max) {
//                      max=count;
//                  }
//                   count=0;
//               }
//                else if( num== 1) {                  
//                      count++;
//                }
//          }
//         return Math.max(count,max);
//     }
// }
