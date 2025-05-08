class Country {
    String name;
    int population;

    Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String toString() {
        return name + " (" + population + ")";
    }
}

class BNode {
    Country data;
    BNode left, right;

    BNode(Country data) {
        this.data = data;
    }
}

class BSTCountry {
    BNode root;

    void insert(Country country) {
        root = insert(root, country);
    }

    private BNode insert(BNode node, Country country) {
        if (node == null) return new BNode(country);

        if (country.population < node.data.population)
            node.left = insert(node.left, country);
        else
            node.right = insert(node.right, country);

        return node;
    }

    void inorder() {
        System.out.println("In-order Traversal:");
        inorder(root);
        System.out.println();
    }

    private void inorder(BNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }

    Country findMax() {
        if (root == null) return null;
        BNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    Country findMin() {
        if (root == null) return null;
        BNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }
}

public class Q4 {
    public static void main(String[] args) {
        BSTCountry bst = new BSTCountry();

        bst.insert(new Country("Norway", 5400000));
        bst.insert(new Country("Germany", 83000000));
        bst.insert(new Country("Canada", 38000000));
        bst.insert(new Country("Brazil", 213000000));
        bst.insert(new Country("Iceland", 366000));
        bst.insert(new Country("India", 1390000000));
        bst.insert(new Country("Japan", 125000000));

        bst.inorder();
        System.out.println("Country with max population: " + bst.findMax());
        System.out.println("Country with min population: " + bst.findMin());
    }
}
