class Solution {
    public boolean hasAllCodes(String s, int k) {
        int need = 1 << k; // 000000001 >> 3  = 000001000
        Set<String> got = new HashSet<String>();

        for (int i = k; i <= s.length(); i++) { 
            String a = s.substring(i - k, i); // 00110110 
            if (!got.contains(a)) { // a = 00
                got.add(a);
                need--;
                // return true when found all occurrences
                if (need == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}