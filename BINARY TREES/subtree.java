public class subtree {
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
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static boolean isIdentical(Node root1, Node root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.data != root2.data){
            return false;
        }
        if(!isIdentical(root1.left, root2.left)){
            return false;
        }
        if(!isIdentical(root1.right, root2.right)){
            return false;
        }
        return true;

    }
    public static boolean isSubtree(Node root1 , Node root2){
        if(root1 == null){
            return false;
        }
        

        if(root1.data == root2.data){
            if(isIdentical(root1, root2)){
                return true;
            }
        }
        boolean leftans = isSubtree(root1.left, root2);
        boolean rightans = isSubtree(root1.right, root2);
        return leftans || rightans;

        
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        inorder(root);
        // preorder(root);
        // postorder(root);
        // Node root2 = new Node(2);
        // root2.left = new Node(4);
        // root2.right = new Node(5);
        // System.out.println(isSubtree(root, root2));
    }
}
