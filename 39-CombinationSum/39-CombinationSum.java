// Last updated: 4/8/2025, 12:08:39 am
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> l = new ArrayList<>();
		List<Integer> ll = new ArrayList<>();
		coin_permutation(0,candidates,target,ll,l);
		return l;
	}
	
	public static void coin_permutation(int t,int[] coin, int amt,List<Integer>ll,List<List<Integer>> l) {
		if(amt==0) {
			l.add(new ArrayList<>(ll));
			return;
		}
		for(int i = t ; i<coin.length;i++) {
			if(amt>=coin[i]) {
				ll.add(coin[i]);
				coin_permutation(i,coin, amt-coin[i],ll,l);
				ll.remove(ll.size()-1);
			}
		}
	}
}