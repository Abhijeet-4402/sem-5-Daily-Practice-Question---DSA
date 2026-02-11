// Last updated: 11/2/2026, 12:44:12 pm
1class Solution {
2    public int findMaximumXOR(int[] nums) {
3        Trie t = new Trie();
4		for(int x: nums) t.add(x);
5		int ans = 0;
6		for(int x: nums) {
7			ans = Math.max(t.getMaxXor(x), ans);
8		}
9		
10		return ans;
11
12	}
13
14	static class Trie {
15		class Node {
16			Node zero;
17			Node one;
18		}
19
20		private Node root = new Node();
21
22		public void add(int val) {
23			Node curr = root;
24			for (int bit = 31; bit >= 0; bit--) {
25				if ((val & (1 << bit)) == 0) {
26					if (curr.zero != null) {
27						curr = curr.zero;
28					} else {
29						curr.zero = new Node();
30						curr = curr.zero;
31					}
32				} else {
33					if (curr.one != null) {
34						curr = curr.one;
35					} else {
36						curr.one = new Node();
37						curr = curr.one;
38					}
39				}
40			}
41		}
42		
43		public int getMaxXor(int x) {
44			int ans = 0;
45			Node curr = root;
46			for (int bit = 31; bit >= 0; bit--) {
47				if((x&(1<<bit))==0) {
48					if(curr.one!=null) {
49						ans|=(1<<bit);
50						curr = curr.one;
51					}else {
52						curr = curr.zero;
53					}
54				} else {
55					if(curr.zero!=null) {
56						ans|=(1<<bit);
57						curr = curr.zero;
58					}else {
59						curr = curr.one;
60					}
61					
62				}
63			}
64			return ans;
65		}
66		
67	}
68}
69