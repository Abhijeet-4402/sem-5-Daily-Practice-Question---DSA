// Last updated: 5/2/2026, 12:54:07 pm
1class Solution {
2    static List<String> ll;
3    public List<String> findWords(char[][] board, String[] words) {
4        ll = new ArrayList<>();
5    Trie t = new Trie();
6		for (String s : words) {
7			t.insert(s);
8		}
9		
10		for(int i = 0;i<board.length;i++) {
11			for(int j = 0;j<board[0].length;j++) {
12				if(t.root.child.containsKey(board[i][j])) {
13					t.Search(board, i,j,t.root);
14				}
15			}
16		}
17		return ll;
18
19	}
20
21	static class Trie {
22		class Node {
23			char ch;
24			String isTerminal;
25			HashMap<Character, Node> child;
26
27			public Node(char ch) {
28				this.ch = ch;
29				child = new HashMap<>();
30			}
31		}
32
33		Node root = new Node('*');
34
35		public void insert(String word) {
36			Node curr = root;
37			for (int i = 0; i < word.length(); i++) {
38				char ch = word.charAt(i);
39				if (curr.child.containsKey(ch)) {
40					curr = curr.child.get(ch);
41				} else {
42					Node nn = new Node(ch);
43					curr.child.put(ch, nn);
44					curr = nn;
45				}
46			}
47			curr.isTerminal = word;
48		}
49		
50		public void Search(char[][]maze, int i, int j, Node node) {
51			if(i<0 ||i>=maze.length||j<0||j>=maze[0].length||!node.child.containsKey(maze[i][j])) return;
52			char ch = maze[i][j];
53			node = node.child.get(ch);
54			if(node.isTerminal!=null) {
55				ll.add(node.isTerminal);
56				node.isTerminal = null;
57			}
58			maze[i][j] = '*';
59			
60			Search(maze, i+1, j, node);
61			Search(maze, i-1, j, node);
62			Search(maze, i, j+1, node);
63			Search(maze, i, j-1, node);
64			
65			maze[i][j] = ch;
66		}
67	}
68}
69
70
71