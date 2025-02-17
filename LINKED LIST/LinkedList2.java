public class LinkedList2 {
    public static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    
    public void addfirstt(int data) {
        // Step 1: Create a new node
        Node newnode = new Node(data);
        
        // If the linked list is empty
        if (head == null) {
            head = newnode;
            tail = head;
            return;
        }
        
        // Step 2: Attach the new node to the linked list
        newnode.next = head; // Link
        // Step 3: Move head to the new node
        head = newnode;
    }
    
    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.addfirstt(1);
        list.addfirstt(2);

        // Print the linked list
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }

        
        
}
}
