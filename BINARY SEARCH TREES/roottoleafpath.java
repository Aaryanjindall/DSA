public class roottoleafpath {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;

        }
    }

    public static void printtoleaf(Node root , ArrayList<Intger>path){
        
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

    }
}
