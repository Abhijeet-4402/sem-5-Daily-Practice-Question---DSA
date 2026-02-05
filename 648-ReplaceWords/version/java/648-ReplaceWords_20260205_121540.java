// Last updated: 5/2/2026, 12:15:40 pm
1class Solution {
2    public String replaceWords(List<String> dictionary, String setn) {
3        Trie t = new Trie();
4		for(String x:dictionary) {
5			t.insert(x);
6		}
7		String[] sentence = setn.split(" ");
8		StringBuilder sb = new StringBuilder();
9		for(int i = 0;i<sentence.length;i++) {
10			sb.append(t.search(sentence[i])).append(" ");
11		}
12		return sb.toString().trim();
13    }
14        
15   static class Trie {
16		class Node {
17			char ch;
18			String isTerminal;
19			HashMap<Character, Node> child;
20
21			public Node(char ch) {
22				this.ch = ch;
23				child = new HashMap<>();
24			}
25		}
26
27		private Node root = new Node('*');
28
29		public void insert(String word) {
30			Node curr = root;
31			for (int i = 0; i < word.length(); i++) {
32				char ch = word.charAt(i);
33				if (curr.child.containsKey(ch)) {
34					curr = curr.child.get(ch);
35				} else {
36					Node nn = new Node(ch);
37					curr.child.put(ch, nn);
38					curr = nn;
39				}
40			}
41			curr.isTerminal = word;
42		}
43		
44		public String search(String word) {
45			Node curr = root;
46			for(char ch: word.toCharArray()) {
47				if(curr.child.containsKey(ch)) {
48					curr = curr.child.get(ch);
49					if(curr.isTerminal!=null) {
50						return curr.isTerminal;
51					}
52				}else {
53					return word;
54				}
55			}
56			return word;
57		}
58	}
59
60}
61