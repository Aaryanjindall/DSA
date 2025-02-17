public class Linkedlist3 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void addlast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = head;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public static void main(String[] args) {
        Linkedlist3 ll = new Linkedlist3();
        addlast(1);
        addlast(2);

        Node current = head;
        while(current != null){
            System.out.print(current.data);
            current = current.next;
        }
    }
}
