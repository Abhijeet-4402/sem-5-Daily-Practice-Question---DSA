// Last updated: 23/7/2026, 9:34:54 am
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String word: words){
            int sum = 0;
            for(char c: word.toCharArray()){
                sum+= weights[c-'a'];
            }
            sum%=26;
            sb.append((char)('a'+(25-sum)));
        }

        return sb.toString();
    }
}