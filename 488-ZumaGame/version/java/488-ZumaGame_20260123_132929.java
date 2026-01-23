// Last updated: 23/1/2026, 1:29:29 pm
1public class Solution {
2    class State {
3        String board;
4        String hand;
5        int steps;
6        State(String board, String hand, int steps) {
7            this.board = board;
8            this.hand = hand;
9            this.steps = steps;
10        }
11    }
12
13    public int findMinStep(String board, String hand) {
14
15        char[] Hand = hand.toCharArray();
16        Arrays.sort(Hand);
17        String sortedHand = new String(Hand);
18
19        Queue<State> queue = new ArrayDeque<>();
20        Set<String> visited = new HashSet<>();
21        
22        queue.offer(new State(board, sortedHand, 0));
23        visited.add(board + "#" + sortedHand);
24
25        while (!queue.isEmpty()) {
26            State curr = queue.poll();
27            String currBoard = curr.board;
28            String currHand = curr.hand;
29            for (int i = 0; i <= currBoard.length(); i++) {
30                for (int j = 0; j < currHand.length(); j++) {
31                    
32                    if (j > 0 && currHand.charAt(j) == currHand.charAt(j - 1)) {
33                        continue;
34                    }
35
36                    if (i > 0 && currBoard.charAt(i - 1) == currHand.charAt(j)) {
37                        continue;
38                    }
39
40                    boolean isWorthTrying = false;
41                    
42                    if (i < currBoard.length() && currBoard.charAt(i) == currHand.charAt(j)) {
43                        isWorthTrying = true;
44                    }
45                    
46                    else if (i > 0 && i < currBoard.length() 
47                             && currBoard.charAt(i - 1) == currBoard.charAt(i)
48                             && currBoard.charAt(i) != currHand.charAt(j)) { 
49                        isWorthTrying = true;
50                    }
51                    if (isWorthTrying) {
52                        String nextBoard = currBoard.substring(0, i) 
53                                         + currHand.charAt(j) 
54                                         + currBoard.substring(i);
55                        
56                        nextBoard = resolve(nextBoard, i);
57
58                        if (nextBoard.isEmpty()) {
59                            return curr.steps + 1;
60                        }
61
62                        String nextHand = currHand.substring(0, j) + currHand.substring(j + 1);
63
64                        String stateKey = nextBoard + "#" + nextHand;
65                        if (visited.add(stateKey)) {
66                            queue.offer(new State(nextBoard, nextHand, curr.steps + 1));
67                        }
68                    }
69                }
70            }
71        }
72        return -1;
73    }
74
75    private String resolve(String board, int i) {
76        if (i < 0) return board;
77
78        int left = i;
79        int right = i;
80
81        while (left > 0 && board.charAt(left - 1) == board.charAt(i)) {
82            left--;
83        }
84        while (right + 1 < board.length() && board.charAt(right + 1) == board.charAt(i)) {
85            right++;
86        }
87
88        int length = right - left + 1;
89        
90        if (length >= 3) {
91            String newBoard = board.substring(0, left) + board.substring(right + 1);
92            return resolve(newBoard, left - 1);
93        }
94        
95        return board;
96    }
97}