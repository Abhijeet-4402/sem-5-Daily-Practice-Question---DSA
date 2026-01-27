// Last updated: 27/1/2026, 9:50:29 pm
class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();
        func(sb, digits, 0, res, map);
        return res;
    }

    void func(StringBuilder sb, String digits, int i, List<String> res, String[] map){
        if(i == digits.length()){
            res.add(sb.toString());
            return;
        }
        String l = map[digits.charAt(i)-'0'];
        for(char ch : l.toCharArray()){
            sb.append(ch);
            func(sb, digits, i+1, res, map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}