public class kthancestor {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

    }
    public static int kancestor(Node root , int n , int k){
        if(root.data == n){
            return 0;
        }
        int lefdist = kancestor(root.left, n, k);
        int rightdist = kancestor(root.right, n, k);

        if()


    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);
    }
}
}