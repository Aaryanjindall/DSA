public class mirror {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;

        }
    }

    public static Node mirror(Node root){
        if(root == null){
            return null;
        }

        Node lefts = mirror(root.left);
        Node rights = mirror(root.right);

        root.left = rights;
        root.right = lefts;

        return root;

        
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        
        preorder(root.right);

    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        Node root1 = mirror(root);

        preorder(root1);




    }
}
