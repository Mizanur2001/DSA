import java.util.Stack;

public class binaryTreeIterative {

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
        TreeNode firstNode = new TreeNode(1);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(3);
        TreeNode forthNode = new TreeNode(4);
        TreeNode fifthNode = new TreeNode(5);
        TreeNode sixthNode = new TreeNode(6);
        TreeNode saventhNode = new TreeNode(7);

        root = firstNode;
        firstNode.left = secondNode;
        firstNode.right = thirdNode;

        secondNode.left = forthNode;
        secondNode.right = fifthNode;

        thirdNode.left = sixthNode;
        thirdNode.right = saventhNode;
    }

    public void preOrderIterative() {
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return;
        }

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + "    ");

            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public static void main(String[] args) {
        binaryTreeIterative bti = new binaryTreeIterative();
        bti.createTree();
        bti.preOrderIterative();
    }

}
