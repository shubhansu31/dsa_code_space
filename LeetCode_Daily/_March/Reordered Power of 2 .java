class Solution {
    public boolean reorderedPowerOf2(int N) {
        int[] originalDigits = digits(N);
        for(int i = 0 ; i <= 30 ; i++){
            int[] powerOf2Digits = digits(1 << i);
            if(Arrays.equals(originalDigits , powerOf2Digits)){
                return true;
            }
        }
        return false;
    }
    
    int[] digits(int n){
        int digit[] = new int[10] ;
        while(n > 0){
            digit[ n % 10 ]++;
            n = n / 10;
        }
        return digit;
    }
}