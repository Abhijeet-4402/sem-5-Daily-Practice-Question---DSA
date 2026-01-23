// Last updated: 23/1/2026, 1:19:24 pm
1import java.util.*;
2
3public class Solution {
4    public int findMinStep(String board, String hand) {
5        char[] hChars = hand.toCharArray();
6        Arrays.sort(hChars);
7        String sortedHand = new String(hChars);
8
9        Queue<State> q = new ArrayDeque<>();
10        Set<String> visited = new HashSet<>();
11
12        q.offer(new State(board, sortedHand, 0));
13        visited.add(board + "#" + sortedHand);
14
15        while (!q.isEmpty()) {
16            State curr = q.poll();
17            String b = curr.board;
18            String h = curr.hand;
19
20            for (int i = 0; i <= b.length(); i++) {
21                for (int j = 0; j < h.length(); j++) {
22                    if (j > 0 && h.charAt(j) == h.charAt(j - 1)) continue;
23                    if (i > 0 && b.charAt(i - 1) == h.charAt(j)) continue;
24
25                    boolean pick = false;
26                    if (i < b.length() && b.charAt(i) == h.charAt(j)) pick = true;
27                    else if (i > 0 && i < b.length() && b.charAt(i - 1) == b.charAt(i) && b.charAt(i) != h.charAt(j)) pick = true;
28
29                    if (pick) {
30                        String newBoard = resolve(b.substring(0, i) + h.charAt(j) + b.substring(i), i);
31                        if (newBoard.isEmpty()) return curr.step + 1;
32
33                        String newHand = h.substring(0, j) + h.substring(j + 1);
34                        if (visited.add(newBoard + "#" + newHand)) {
35                            q.offer(new State(newBoard, newHand, curr.step + 1));
36                        }
37                    }
38                }
39            }
40        }
41        return -1;
42    }
43
44    private String resolve(String s, int i) {
45        if (i < 0) return s;
46        int left = i, right = i;
47        while (left > 0 && s.charAt(left - 1) == s.charAt(i)) left--;
48        while (right + 1 < s.length() && s.charAt(right + 1) == s.charAt(i)) right++;
49
50        if (right - left + 1 >= 3) {
51            return resolve(s.substring(0, left) + s.substring(right + 1), left - 1);
52        }
53        return s;
54    }
55
56    record State(String board, String hand, int step) {}
57}