// Last updated: 28/8/2025, 12:05:34 pm
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<VP> queue = new LinkedList<>();
        TreeMap<Integer, List<VP>> map = new TreeMap<>();

        queue.add(new VP(root, 0, 0));

        while (!queue.isEmpty()) {
            VP current = queue.poll();
            
            if (!map.containsKey(current.v)) {
                map.put(current.v, new ArrayList<>());
            }
            map.get(current.v).add(current);

            if (current.node.left != null) {
                queue.add(new VP(current.node.left, current.l + 1, current.v - 1));
            }
            if (current.node.right != null) {
                queue.add(new VP(current.node.right, current.l + 1, current.v + 1));
            }
        }

        for (int verticalIndex : map.keySet()) {
            List<VP> nodesAtVertical = map.get(verticalIndex);
            
            Collections.sort(nodesAtVertical, (a, b) -> {
                if (a.l != b.l) {
                    return Integer.compare(a.l, b.l);
                }
                return Integer.compare(a.node.val, b.node.val);
            });

            List<Integer> columnResult = new ArrayList<>();
            for (VP nodePair : nodesAtVertical) {
                columnResult.add(nodePair.node.val);
            }
            result.add(columnResult);
        }

        return result;
    }
}

class VP {
    TreeNode node;
    int l;
    int v;

    public VP(TreeNode node, int l, int v) {
        this.node = node;
        this.l = l;
        this.v = v;
    }
}