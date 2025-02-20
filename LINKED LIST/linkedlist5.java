public class linkedlist5 {
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
    public static int size;

    public void addfirstt(int data) {
        // Step 1: Create a new node
        Node newnode = new Node(data);
        size++;
        
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


    public void addmid(int idx, int data) {
        if(idx == 0){
            addfirstt(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        // when i = idx-1
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int removefirst(){
        if(size == 0){
            System.out.println("List is empty");
            return -1;
        }
        else if(size == 1){
            int val = head.data;
            head = null;
            tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;


    }

    public int removeLast(){
        if(size == 0){
            System.out.println("List is empty");
            return -1;
        }
        else if(size == 1){
            int val = head.data;
            head = null;
            tail = null;
            size = 0;
            return val;
        }
        Node prev = head;

        for(int i = 0 ; i<size-2; i++){
            prev = prev.next;
        }
        
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        linkedlist5 ll = new linkedlist5();
        ll.addfirstt(1);
        ll.addfirstt(2);
        ll.addfirstt(3);
        ll.addmid(1,4);

        ll.removefirst();
        ll.removeLast();
        



        
        

        Node current = head;
        while(current != null){
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println();
        System.out.println(size);
        
        

    }
}
