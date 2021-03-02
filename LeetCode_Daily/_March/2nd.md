# Set Mismatch

You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

* Example 1:

~~~Input: nums = [1,2,2,4]
Output: [2,3]
~~~

* Example 2:

~~~Input: nums = [1,1]
Output: [1,2]
~~~

## Constraints

* 2 <= nums.length <= 104
* 1 <= nums[i] <= 104

## Java

~~~class Solution {
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
~~~
