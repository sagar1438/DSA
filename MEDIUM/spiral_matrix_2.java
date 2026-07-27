class Solution {
    int idx = 0;

    public Node constructBinaryTree(int[] pre, int[] preMirror) {
        return build(pre, preMirror, 0, pre.length - 1);
    }

    private Node build(int[] pre, int[] preMirror, int l, int r) {
        if (l > r || idx >= pre.length) return null;

        Node root = new Node(pre[idx++]);

        if (l == r || idx >= pre.length) return root;

        int i = l;
        while (preMirror[i] != pre[idx]) i++;

        root.left = build(pre, preMirror, i, r);
        root.right = build(pre, preMirror, l + 1, i - 1);

        return root;
    }
} 