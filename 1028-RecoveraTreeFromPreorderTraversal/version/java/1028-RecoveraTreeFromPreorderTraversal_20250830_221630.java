// Last updated: 30/8/2025, 10:16:30 pm
class Solution {
    class Pair {
        TreeNode node;
        int depth;
        Pair(TreeNode n, int d) {
            node = n;
            depth = d;
        }
    }

    TreeNode recoverFromPreorder(String traversal) {
        Stack<Pair> stack = new Stack<>();
        int i = 0, n = traversal.length();

        while (i < n) {
            int depth = 0;
            while (i < n && traversal.charAt(i) == '-') {
                depth++;
                i++;
            }

            int val = 0;
            while (i < n && Character.isDigit(traversal.charAt(i))) {
                val = val * 10 + (traversal.charAt(i) - '0');
                i++;
            }

            TreeNode node = new TreeNode(val);

            while (!stack.isEmpty() && stack.peek().depth >= depth) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                TreeNode parent = stack.peek().node;
                if (parent.left == null) parent.left = node;
                else parent.right = node;
            }

            stack.push(new Pair(node, depth));
        }

        while (stack.size() > 1) stack.pop();
        return stack.peek().node;
    }
}
