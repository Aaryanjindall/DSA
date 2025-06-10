public class Doublylinkedlist {
    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void removeFirst(){
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        if(size == 1){
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void reverse() {
        Node curr = head;
        Node previous = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = previous;
            curr.prev = next;
            previous = curr;
            curr = next;
        }
        head = previous;
    }

    public void printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Doublylinkedlist list = new Doublylinkedlist();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.printlist();
        list.removeFirst();
        list.printlist();
        list.reverse();
        list.printlist();

        System.out.println("Size: " + size);
    }
}
