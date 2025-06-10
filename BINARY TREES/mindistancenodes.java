public class mindistancenodes {
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
    public static Node lca2(Node root , int n1 , int n2){
        if(root == null){
            return root;
        }
        if(root.data == n1 || root.data == n2){
            return root;
        }
        Node leftlca = lca2(root.left,n1,n2);
        Node rightlca  = lca2(root.right , n1 , n2);

        if(rightlca == null){
            return leftlca;
        }
        if(leftlca == null){
            return rightlca;
        }

        return root;

        
    }
    public static int lcadist(Node root , int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftdist = lcadist(root.left , n);
        int rightdist = lcadist(root.right , n);
        if(leftdist == -1 && rightdist == -1){
            return -1;
        }
        else if(leftdist == -1){
            return rightdist +1;
        }
        else{
            return leftdist+1;
        }


    }
    public static int mindist(Node root , int n1 , int n2){
        Node lca = lca2(root,n1,n2);
        int dist = lcadist(lca,n1);
        int dist2 = lcadist(lca,n2);
        return dist + dist2;


    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);
        int n1 = 4;
        int n2 = 6;
        System.out.println(mindist(root1, n1, n2));


    }
}
 