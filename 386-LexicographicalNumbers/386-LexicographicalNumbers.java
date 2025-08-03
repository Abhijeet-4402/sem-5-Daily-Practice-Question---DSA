// Last updated: 4/8/2025, 12:05:47 am
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ll = new ArrayList<Integer>();
		lexicographical(n,0,ll);
        return ll;
    }
    public static void lexicographical(int n,int curr,List<Integer> ll) {
		if(curr>n)return;
        int i = 0;
		if(curr==0) {
			i = 1;
		}else{
            ll.add(curr);
        }
		for(; i <= 9; i++) {
			lexicographical(n,curr*10+i,ll);
		}
	}
}