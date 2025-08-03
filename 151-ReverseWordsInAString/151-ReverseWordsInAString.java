// Last updated: 4/8/2025, 12:07:10 am
class Solution {
    public String reverseWords(String s) {
        if (s.length() < 1) {
            return "";
        }
        String[] words = s.split("\\s+");
        StringBuilder reversedWords = new StringBuilder();
        for (int index = words.length - 1; index >= 0; index--) {
            reversedWords.append(words[index]);
            reversedWords.append(" ");

        }
        return reversedWords.toString().trim();
        
    }
}