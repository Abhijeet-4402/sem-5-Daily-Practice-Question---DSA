// Last updated: 4/8/2025, 12:08:04 am
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int index = 0;
        int n = words.length;

        while (index < n) {
            int totalChars = words[index].length();
            int last = index + 1;

            // Determine how many words fit in the current line
            while (last < n && totalChars + words[last].length() + (last - index) <= maxWidth) {
                totalChars += words[last].length();
                last++;
            }

            StringBuilder line = new StringBuilder();
            int numWords = last - index;
            int numSpaces = maxWidth - totalChars;

            // Case 1: Last line or only one word in line -> left justify
            if (last == n || numWords == 1) {
                for (int i = index; i < last; i++) {
                    line.append(words[i]);
                    if (i < last - 1) line.append(" ");
                }
                // Fill remaining spaces
                int remaining = maxWidth - line.length();
                line.append(" ".repeat(remaining));
            } else {
                // Case 2: Fully justify
                int spacesBetweenWords = numSpaces / (numWords - 1);
                int extraSpaces = numSpaces % (numWords - 1);

                for (int i = index; i < last; i++) {
                    line.append(words[i]);
                    if (i < last - 1) {
                        int spacesToAdd = spacesBetweenWords + (i - index < extraSpaces ? 1 : 0);
                        line.append(" ".repeat(spacesToAdd));
                    }
                }
            }

            ans.add(line.toString());
            index = last;
        }

        return ans;
    }
}
