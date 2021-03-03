class Solution {
    public int missingNumber(int[] nums) {
        // sum of n integers = (n * (n + 1))/2 
        int actualSum = nums.length * (nums.length + 1);
        actualSum /= 2;
        int currentSum = 0;
        for(int num : nums){
            currentSum += num;
        }
        return actualSum - currentSum;
        
//         int xor = 0;
//         for(int i = 0 ; i <= nums.length ; i++ ){
//             xor = xor ^ i;
//         }
//         for(int num : nums){
//             xor = xor ^ num;
//         }
        
//         return xor;
    }
}
// 0 2 3 
//0 1 2 3