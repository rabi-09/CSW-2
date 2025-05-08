class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class BST {
    Node root;

    void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }
        if (data < node.data)
            node.left = insertRec(node.left, data);
        else if (data > node.data)
            node.right = insertRec(node.right, data);
        return node;
    }

    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.data + " ");
            inorderRec(node.right);
        }
    }

    void delete(int data) {
        root = deleteRec(root, data);
    }

    private Node deleteRec(Node node, int data) {
        if (node == null) {
            return node;
        }

        if (data < node.data)
            node.left = deleteRec(node.left, data);
        else if (data > node.data)
            node.right = deleteRec(node.right, data);
        else {
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            node.data = minValue(node.right);
            node.right = deleteRec(node.right, node.data);
        }

        return node;
    }

    private int minValue(Node node) {
        int minValue = node.data;
        while (node.left != null) {
            minValue = node.left.data;
            node = node.left;
        }
        return minValue;
    }
}

public class Q5 {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("In-order traversal of the tree:");
        tree.inorder();

        System.out.println("\nDeleting node with value 20:");
        tree.delete(20);
        tree.inorder();

        System.out.println("\nDeleting node with value 30:");
        tree.delete(30);
        tree.inorder();

        System.out.println("\nDeleting node with value 50:");
        tree.delete(50);
        tree.inorder();
    }
}
