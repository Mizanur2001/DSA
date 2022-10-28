public class tree {
    private class TreeNode {
        private int data;
        private TreeNode right;
        private TreeNode left;

        public TreeNode(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public TreeNode root;

    public void createTree() {
        TreeNode firstNode = new TreeNode(9);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(3);
        TreeNode forthNode = new TreeNode(4);
        TreeNode fifthNode = new TreeNode(5);

        root = firstNode;
        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        
        secondNode.left = forthNode;
        thirdNode.right = fifthNode;

    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "  ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        tree tree = new tree();
        tree.createTree();
        tree.preOrder(tree.root);
    }
}
