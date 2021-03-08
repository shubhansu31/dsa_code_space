class Solution {
    public int removePalindromeSub(String s) {
        if(s.length() == 0)
            return 0;
        String rev = new StringBuilder(s).reverse().toString();
        if(s.equals(rev))
            return 1;
        return 2;
    }
}