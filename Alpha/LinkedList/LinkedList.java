public class LinkedList {
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

    public void addFirst(int data){
        // Step 1- create new Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2- newNode next = head
        newNode.next = head;
        //Step 3 - head = newNode
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addInd(int ind, int data){
        if(ind == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < ind - 1) {
            temp = temp.next;
            i++;
        }

        // i = ind - 1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
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
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev: i = size - 2
        Node prev = head;
        for(int i = 0; i < size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int iterationSrc(int key){   // O(n)
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found 
        return -1;
    }

    public int helper(Node head, int key){ //O(n)
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int ind = helper(head.next, key);
        if(ind == -1){
            return -1;
        }
        return ind+1;
    }
    public int recursiveSrc(int key){
        return helper(head, key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthIndex(int n){
        // calculating size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;   //removeFirst
            return;
        }

        // sz - n
        int i = 1;
        int itoFind = sz-n;
        Node prev = head;
        while (i < itoFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static boolean isCycle(){    //Floyid cycle algo
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;   // +1
            fast = fast.next.next;  // +2

            if(fast == slow){
                return true;    //cycle exist
            }
        }
        return false;   // Cycle does not exist
    }

    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null; // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle -> last.next= null
        prev.next = null;
    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left  right ms
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }
    private Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        
        while (head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; 
    }
    public void zigZagNode(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // alternative merge - zig zag marge
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
        // ll.addLast(5);
        // ll.addInd(2, 3);

        // ll.print(); // 1 -> 2 -> 3 -> 4 -> 5 -> null
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        
        // System.out.println(ll.iterationSrc(3));
        // System.out.println(ll.iterationSrc(10));

        // System.out.println(ll.recursiveSrc(3));
        // System.out.println(ll.recursiveSrc(10));
        // ll.reverse();   5 -> 4 -> 3 -> 2 -> 1 -> null 
        // ll.removeNthIndex(2);
        // ll.print();

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        ll.addFirst(0);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addFirst(-1);

        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
        
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addLast(6);

        // ll.print();
        // ll.zigZagNode();
        // ll.print();

    }    
}