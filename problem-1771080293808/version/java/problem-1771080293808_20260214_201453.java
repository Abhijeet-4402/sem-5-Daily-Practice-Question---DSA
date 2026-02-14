// Last updated: 14/2/2026, 8:14:53 pm
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder sb = new StringBuilder();
4        for(String word: words){
5            int sum = 0;
6            for(char c: word.toCharArray()){
7                sum+= weights[c-'a'];
8            }
9            sum%=26;
10            sb.append((char)('a'+(25-sum)));
11        }
12
13        return sb.toString();
14    }
15}