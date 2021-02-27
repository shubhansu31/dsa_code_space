class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        int dividendAbs = Math.abs(dividend);
        int divisorAbs = Math.abs(divisor);
        int result = getCount(dividendAbs , divisorAbs);
        return (dividend < 0) == (divisor < 0) ? result : - result;
    }
    
    public int getCount(int dividend , int divisor){
        int count = 0;
        while(dividend - divisor >= 0){
            int step = 1;
            int cur = divisor;
            while(dividend - (cur + cur) > 0){
                cur = cur + cur;
                step = step + step;
            }
            dividend = dividend - cur;
            count = count + step;
        }
        return count ;
    }
}
    