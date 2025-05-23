import java.util.*;
public class queue{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;

        }
        public static boolean isEmpty(){
            return rear ==  -1 && front == -1;

        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            rear = (rear +1)% size;
            //add the first element to the front
            if(front == -1){
                front = 0;
            }
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;

            }
            int result  = arr[front];
            //if only one element is present
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front + 1)% size;
            }
            

            return result;


        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.peek());
        q.add(5);
        q.add(6);
        q.add(7);


   
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();

    }
}
}