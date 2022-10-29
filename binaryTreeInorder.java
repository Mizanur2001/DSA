public class binaryTreeInorder {
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

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + "    ");
        inOrder(root.right);

    }

    public static void main(String[] args) {
        binaryTreeInorder bti = new binaryTreeInorder();
        bti.createTree();
        bti.inOrder(bti.root);
    }
}