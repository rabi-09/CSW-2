class BSTNode{
    int info;
    BSTNode left, right;
    BSTNode(int info){
        this.info = info;
    }
}

class Q1{
    static BSTNode root=null;
   
    BSTNode insert(BSTNode node, int data) {
        if (node == null) return new BSTNode(data);
        if (data < node.info)
            node.left = insert(node.left, data);
        else if (data > node.info)
            node.right = insert(node.right, data);
        return node;
    }

    void preorder(BSTNode root){
        if(root != null){
            System.out.print(root.info+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    void inorder(BSTNode root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.info+" ");
            inorder(root.right);
        }
    }
    void postorder(BSTNode root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.info+" ");
        }
    }
    public static void main(String[] args) {
        Q1 tree = new Q1();
        int [] arr = {10,20,50,40,60,80,90};
        for(int i : arr)
            root = tree.insert(root, i);

        System.out.println("\nPREORDER : ");
        tree.preorder(root);
        System.out.println("\nINORDER : ");
        tree.inorder(root);
        System.out.println("\nPOSTORDER : ");
        tree.postorder(root);
    }
}