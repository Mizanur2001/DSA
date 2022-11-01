public class binaryTreePostOrderRecursive {
    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public TreeNode root;

    public void createTree() {
        TreeNode firstNode = new TreeNode(9);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(3);
        TreeNode forthNode = new TreeNode(4);

        root = firstNode;
        firstNode.left = secondNode;
        firstNode.right = thirdNode;

        secondNode.left = forthNode;
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "    ");
    }

    public static void main(String[] args) {
        binaryTreePostOrderRecursive btpor = new binaryTreePostOrderRecursive();
        btpor.createTree();
        btpor.postOrder(btpor.root);
    }
}
