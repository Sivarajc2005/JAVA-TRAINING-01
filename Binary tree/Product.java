public class Product {
    static class Node {
        int id;
        String category;
        String productname;
        int price;
        Node left, right;

        public Node(int id, String category, String productname, int price) {
            this.id = id;
            this.category = category;
            this.productname = productname;
            this.price = price;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Category: " + category + ", Product: " + productname + ", Price: " + price;
        }
    }

    Node root;

    public static Node insert(int id, String category, String productname, int price, Node root) {
        if (root == null) {
            return new Node(id, category, productname, price);
        }

        if (id < root.id) {
            root.left = insert(id, category, productname, price, root.left);
        } else if (id > root.id) {
            root.right = insert(id, category, productname, price, root.right);
        }

        return root;
    }

    public static void display(Node root) {
        if (root == null) {
            System.out.println("no data");
            return;
        }

        System.out.println(root);
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        Product tree = new Product();

        tree.root = new Node(9, "Electronics", "Laptop", 50000);

        tree.root = insert(10, "Electronics", "Laptop", 50000, tree.root);
        tree.root = insert(5, "Furniture", "Chair", 2000, tree.root);
        tree.root = insert(15, "Appliances", "Microwave", 7000, tree.root);

        display(tree.root);


        
    }
}


