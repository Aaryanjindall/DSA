public class height {
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
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;


    }
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftc = count(root.left);
        int rightc = count(root.right);
        return leftc + rightc + 1;

        }
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int lefts = sum(root.left);
        int rights = sum(root.right);
        return lefts + rights + root.data;
    }
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        System.out.println("Height of the tree is: " + height(root));
        System.out.println("Count of the tree is: " + count(root));
        System.out.println("Sum of the tree is: " + sum(root));
    }
}



        // System.out.println("Preorder traversal of the tree is: ");


