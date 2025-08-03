// Last updated: 4/8/2025, 12:09:02 am
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> par = new ArrayList<String>();
		paranthesis(n,0,0,"",par);
        return par;
    }
    public static void paranthesis(int n ,int closed , int open, String ans,List<String>par) {
		if(open == n && closed == n) {
			par.add(ans);
			return;
		}
		if(open>n || closed >open) {
			return;
		}
		paranthesis(n,closed,open+1,ans+"(",par);
		paranthesis(n,closed+1,open,ans+")",par);
		
	}
}