class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        boolean flag = false;
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] < nums[i-1])
                flag = true;
            if(flag)
                min = Math.min(min , nums[i]);
        }
        flag = false;
        for(int i = nums.length - 2 ; i >= 0 ; i--){
            if(nums[i] > nums[i+1])
                flag = true;
            if(flag)
                max = Math.max(max , nums[i]);
        }
        
        int start = 0 , end = nums.length - 1 ;
        for(; start < nums.length ; start++){
            if(min < nums[start])
                break;
        }
        for(; end >= 0 ; end--){
            if(max > nums[end])
                break;
        }
        
        if(end - start > 0){
            return end - start + 1;
        }
        else
            return 0;
    }
}