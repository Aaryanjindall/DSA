public class leatcomonansc {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
}
    public static Node lca(Node root , int n1 , int n2){
        if(root == null){
            return root;
        }
        if(root.data == n1 || root.data == n2){
            return root;
        }
        Node leftlca = lca(root.left,n1,n2);
        Node rightlca  = lca(root.right , n1 , n2);

        if(rightlca == null){
            return leftlca;
        }
        if(leftlca == null){
            return rightlca;
        }

        return root;

        
    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);
        Node ans = lca(root1,5,6);
        System.out.println(ans.data);

    }
}
