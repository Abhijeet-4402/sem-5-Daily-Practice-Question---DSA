// Last updated: 4/8/2025, 12:05:32 am
class Solution {
    public String originalDigits(String s) {
        int[] count = new int[26];  // count for each letter a-z

        // Count each character in the input string
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int[] digit = new int[10];

        // Unique letters that identify the digits directly
        digit[0] = count['z' - 'a']; // "zero"
        digit[2] = count['w' - 'a']; // "two"
        digit[4] = count['u' - 'a']; // "four"
        digit[6] = count['x' - 'a']; // "six"
        digit[8] = count['g' - 'a']; // "eight"

        // Use remaining characters to find other digits
        digit[3] = count['h' - 'a'] - digit[8]; // "three"
        digit[5] = count['f' - 'a'] - digit[4]; // "five"
        digit[7] = count['s' - 'a'] - digit[6]; // "seven"
        digit[1] = count['o' - 'a'] - digit[0] - digit[2] - digit[4]; // "one"
        digit[9] = count['i' - 'a'] - digit[5] - digit[6] - digit[8]; // "nine"

        // Build result
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            while (digit[i]-- > 0) {
                sb.append(i);
            }
        }

        return sb.toString();
    }
}