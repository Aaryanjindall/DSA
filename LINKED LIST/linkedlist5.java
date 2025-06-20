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

    public int itrsearch(int key){
        Node temp = head;
        int i = 0;
        while(temp!= null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;

        }
        return -1;

    }
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int recans = helper(head.next, key);
        if(recans == -1){
            return -1;
        }
        return recans+1;
    }

    public int recsearch(int key){
        return helper(head,key);
        }


    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }   


    public void deletenode(int n){
        int sz = 0;
        Node temp = head;
        while(temp!= null){
            temp = temp.next;
            sz++;

        }
        if(n== sz){
            head = head.next;
            return;
        }
        int i = 1;
        int itofind = sz-n;
        Node prev = head;
        while(i < itofind){
            prev = prev.next;
            i++;


        }
        prev.next = prev.next.next;
        return;

    }

//slow - fast technique
    public Node findmid(){
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2


        }
        return slow; // slow is my mid node

    }

    // public boolean checkpalen(){
    //     if(head == null || head.next == null){
    //         return true;
    //     }

    //     //step 1 find mid
    //     Node mid = findmid(head);
    //     //step 2 reverse the right half

    //     Node prev = null;
    //     Node curr = mid;
    //     Node next;
    //     while(curr != null){
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     //step 3 compare left and right

    //     Node right = prev;
    //     Node left = head;


    //     while(right != null){
    //         if(left.data != right.data){
    //             return false;
    //         }
    //         left = left.next;
    //         right = right.next;

    //     }
    //     return true;



    // }


    public void lastnode(){
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;

        }
        curr.next = null;

    }

    
         
    

    public static void main(String[] args) {
        linkedlist5 ll = new linkedlist5();
        ll.addfirstt(1);
        ll.addfirstt(2);
        ll.addfirstt(3);
        ll.addfirstt(4);
        ll.addfirstt(5);
        ll.addfirstt(6);


        // ll.addmid(1,4);

        // ll.removefirst();
        // ll.removeLast();
        ll.lastnode();

        // System.out.println(ll.itrsearch(4));
        // System.out.println(ll.itrsearch(5));
        // System.out.println(ll.recsearch(4));
        // System.out.println(ll.recsearch(5));
        // ll.reverse();
        // System.out.println(ll.checkpalen());
        

        



        
        

        Node current = head;
        while(current != null){
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println();
        System.out.println(size);
        System.out.println(ll.findmid());
        
        

    }
}
