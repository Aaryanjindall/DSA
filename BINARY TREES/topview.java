import java.util.*;
public class topview {
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
    public static class Info{
        Node node;
        int hd;
        Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topvieww(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0;
        int max = 0;
        q.add(new Info(root, 0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                Node node = curr.node;
                int hd = curr.hd;
                if(!map.containsKey(hd)){
                    map.put(hd, node);
                }
                if(curr.node.left != null){
                    q.add(new Info(node.left, hd - 1));
                    min = Math.min(min, hd - 1);
                }

                if(node.right != null){
                    q.add(new Info(node.right, hd + 1));
                    max = Math.max(max, hd + 1);
                }
            }
        }
        for(int i = min; i <= max; i++){
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();


    }

    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);
        topvieww(root1);
    }

    

}
