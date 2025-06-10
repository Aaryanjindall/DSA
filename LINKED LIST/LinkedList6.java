public class LinkedList6 {
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

    public void add(int data) {  // Linked List me add karne ka function
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    public void printList() {  // Print function
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }






    
    public static void zigzag(){
        if (head == null || head.next == null) return;
        //find mid
        Node slow = head;
        Node fast = head;
        Node prev = null;
        

        while(fast != null && fast.next != null){
            prev = slow;
          
            slow = slow.next;
            fast = fast.next.next;
        }
        //divide into two parts
        prev.next = null;


        //reverse second half

        
        Node curr = slow;
        Node temp = null;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = temp;
            temp = curr;
            curr = next;

        }
        Node lefthead = head;
        Node righthead = temp;
        Node leftnext;
        Node rightnext;
        while(lefthead != null && righthead != null){
            leftnext = lefthead.next;
            lefthead.next = righthead;
            rightnext = righthead.next;
            righthead.next = leftnext;
            lefthead = leftnext;
            righthead = rightnext;




        }


    }
    public static void main(String[] args) {
        LinkedList6 ll = new LinkedList6();
        
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);

        ll.printList(); // Output: 1 → 2 → 3 → 4 → 5 → 6 → null
        ll.zigzag();
        ll.printList(); // Output: 1 → 6 → 2 → 5 → 3 → 4 → null
    }
}