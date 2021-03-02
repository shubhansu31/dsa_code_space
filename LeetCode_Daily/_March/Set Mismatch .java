class Solution {
    public int[] findErrorNums(int[] nums) {
        int xor = 0;
        for(int num : nums){
            xor = xor ^ num;
        }
        for(int i = 1 ; i <= nums.length ; i++){
            xor = xor ^ i;
        }
        
        int x = 0 , y = 0;
        int rsb = xor & -xor;
        
        for(int num : nums){
            if((num & rsb) == 0){
                x = x ^ num;
            }
            else{
                y = y ^ num;
            }
        }
        
        for(int i = 1 ; i <= nums.length ; i++){
            if((i & rsb) == 0){
                x = x ^ i;
            }
            else{
                y = y ^ i;
            }
        }
        int result[] = new int[2];
        for(int num : nums){
            if(num == x){
                result[0] = x;
                result[1] = y;
            }
                
            else if(num == y){
                result[0] = y;
                result[1] = x;
            }
        }
        return result;
    }    
}