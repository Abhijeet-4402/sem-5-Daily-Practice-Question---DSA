// Last updated: 4/8/2025, 12:09:09 am
class Solution {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {
        // is concept pr test me question aayega aur mai pok dunga
        List<String> l = new ArrayList<String>();
        if(digits.length()==0)return l;
        Nokia1100(digits,"",l);
        return l;
    }
    public void Nokia1100(String q,String a,List<String> l) {
		if(q.length()==0) {
			l.add(a);
			return;
		}
		char ch = q.charAt(0);
		String gString=key[ch-'0'];
		for(int i = 0; i<gString.length();i++)
			Nokia1100(q.substring(1), a+gString.charAt(i),l);
	}
}