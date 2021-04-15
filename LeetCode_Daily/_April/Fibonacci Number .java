class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int prev = 1 , fibb = 1;
        for(int i = 2 ; i < n ; i++){
            fibb += prev;
            prev = fibb - prev;
        }
        return fibb;
    }
}