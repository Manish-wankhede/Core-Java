public class QueueB {
    static class  Node {
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Que {
        // static int arr[];
        // static int size;
        // static int rear;
        // static int front;

        // Que(int n){
        //     arr = new int[n];
        //     size = n;
        //     rear = -1;
        //     front = -1;
        // }

        static Node head = null;
        static Node tail = null;
        
        public static boolean isEmpty(){
            // return rear == -1 && front == -1;
            return head == null & tail == null; // && will bw used instead of &
        }

        // public static boolean isFull(){
        //     return (rear+1)% size == front;
        // }

        // add
        public static void add(int data){
            // if(isFull()){
            //     System.out.println("Queue id full");
            //     return;
            // }
            // //add 1st element
            // if(front == -1){
            //     front = 0;
            // }

            // rear = (rear + 1) % size;
            // arr[rear] = data;
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            // int front = arr[0];
            // for(int i = 0; i < rear; i++){
            //     arr[i] = arr[i+1];
            // }
            // rear = rear - 1;
            // return front;

            // int result = arr[front];
            // //last el delete
            // if(rear == front){
            //     rear = front = -1;
            // } else {
            //     front = (front + 1) % size;
            // }
            // return result;

            int front = head.data;
            // single element
            if(tail == head){
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }
        
        //peek
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return head.data;
            // return arr[front];
            // return arr[0];
        }
    }
    public static void main(String[] args) {
        Que q = new Que();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}