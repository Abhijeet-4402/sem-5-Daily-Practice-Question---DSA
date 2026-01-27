// Last updated: 27/1/2026, 9:46:11 pm
1class Solution {
2    static String[] phone = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
3    public static List<String> letterCombinations(String digits) {
4		// TODO Auto-generated method stub
5		List<String> ll = new ArrayList<>();
6		findCombinations(digits, 0, "", ll);
7		return ll;
8		
9		
10	}
11	
12	private static void findCombinations(String digit, int idx,String ans, List<String> ll){
13		if(idx == digit.length()) {
14			ll.add(ans);
15			return;
16		}
17		
18		String letters = phone[digit.charAt(idx)-'0'];
19		for(char c:letters.toCharArray()) {
20			findCombinations(digit, idx+1, ans+c, ll);
21		}
22	}
23}