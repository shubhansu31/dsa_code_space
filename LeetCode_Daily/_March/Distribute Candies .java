class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> uniqueType = new HashSet<>();
        for(int candytype : candyType){
            uniqueType.add(candytype);
        }
        
        int types = uniqueType.size();
        int eatble = candyType.length / 2;
        return types >= eatble ? eatble : types;
    }
}