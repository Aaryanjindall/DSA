public class transformsumtree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    public static int sumtree(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sumtree(root.left);
        int rightsum = sumtree(root.right);
        int olddata = root.data;
        int newdata = leftsum + rightsum ;
        

        root.data = newdata;

        return olddata+ leftsum + rightsum;






    }
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);
        sumtree(root1);
        preorder(root1);
        
    }
}
