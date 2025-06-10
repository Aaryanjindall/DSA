public class buildtree{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;

        }
    }

    public static Node insert(Node root , int val){
        // if(root == null){
        //     root = new Node(val);
        //     return root;
        // }

        // if(root.data > val ){
        //     root.left = insert(root.left , val);

        // }
        // else{
        //     root.right = insert(root.right , val);

        // }

        // return root;
        Node temp = root;

        while(root != null){
            if(root == val){
                root = new Node(val);
            }
            if()

        }
    }

    public static void printrange(Node root , int k1 , int k2){

        if(root == null){
            return ;
        }
        if(root.data >= k1 && root.data <= k2){
            printrange(root.left , k1 , k2);
            System.out.println(root.data + " ");
            printrange(root.right , k1 , k2 );
        }
        else if(root.data < k1){
            printrange(root.left , k1 , k2);
        }else{
            printrange(root.right , k1 , k2 );
        }

    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);

    }

    public static void main(String[] args){
        
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i = 0 ; i< values.length ; i++){
            root = insert(root , values[i]);

        }
        // inorder(root);

        printrange(root, 2, 5);
    }
}