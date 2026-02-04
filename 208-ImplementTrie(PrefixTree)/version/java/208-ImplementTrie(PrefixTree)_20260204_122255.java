// Last updated: 4/2/2026, 12:22:55 pm
1public class Trie {
2	class Node {
3		char ch;
4		boolean isterminal;
5		HashMap<Character, Node> child;
6
7		public Node(char ch) {
8			this.ch = ch;
9			child = new HashMap<>();
10		}
11	}
12
13	private Node root;
14
15	public Trie() {
16		root = new Node('*');
17	}
18
19	public void insert(String word) {
20		Node curr = root;
21		for (int i = 0; i < word.length(); i++) {
22			char ch = word.charAt(i);
23			if (curr.child.containsKey(ch)) {
24				curr = curr.child.get(ch);
25			} else {
26				Node nn = new Node(ch);
27				curr.child.put(ch, nn);
28				curr = nn;
29			}
30		}
31		curr.isterminal = true;
32	}
33
34	public boolean search(String word) {
35		Node curr = root;
36		for (int i = 0; i < word.length(); i++) {
37			char ch = word.charAt(i);
38			if (curr.child.containsKey(ch)) {
39				curr = curr.child.get(ch);
40			} else {
41				return false;
42			}
43		}
44		return curr.isterminal;
45	}
46
47	public boolean startsWith(String word) {
48		Node curr = root;
49		for (int i = 0; i < word.length(); i++) {
50			char ch = word.charAt(i);
51			if (curr.child.containsKey(ch)) {
52				curr = curr.child.get(ch);
53			} else {
54				return false;
55			}
56		}
57		return true;
58	}
59
60}
61