public class Q3 {
    boolean isBST(BSTNode node, int min, int max) {
        if (node == null)
            return true;

        if (node.info <= min || node.info >= max)
            return false;

        return isBST(node.left, min, node.info) &&
               isBST(node.right, node.info, max);
    }

    boolean isBST(BSTNode root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        BSTNode root = new BSTNode(40);
        root.left = new BSTNode(20);
        root.right = new BSTNode(60);
        root.left.left = new BSTNode(10);
        root.left.right = new BSTNode(30);
        root.right.left = new BSTNode(50);
        root.right.right = new BSTNode(70);

        Q3 tree = new Q3();

        System.out.println("Is this a BST?: " + tree.isBST(root));
    }
}
