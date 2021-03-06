class Solution {
    public int minimumLengthEncoding(String[] words) {
        HashSet<String> set = new HashSet<String>(Arrays.asList(words));
        for(String word : words){
            for(int i = 1 ; i < word.length() ; i++){
                set.remove(word.substring(i));
            }
        }
        int answer = 0;
        for(String word : set){
            answer += word.length() + 1 ;
        }
        return answer;
    }
}