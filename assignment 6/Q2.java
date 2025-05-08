public class Q2 {
    static BSTNode root=null;
    public static void main(String[] args) {
        Q2 tree = new Q2();
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        tree.createTree(sortedArray);
    }
    BSTNode createTree(int[] arr, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        BSTNode node = new BSTNode(arr[mid]);

        node.left = createTree(arr, start, mid - 1);
        node.right = createTree(arr, mid + 1, end);

        return node;
    }

    void createTree(int[] arr) {
        root = createTree(arr, 0, arr.length - 1);
    }

}
