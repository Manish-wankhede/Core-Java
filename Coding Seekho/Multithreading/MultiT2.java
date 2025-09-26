class Process1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Process1 is: " + i);
        }
    }
}

class Process2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Process2 is: " + i);
        }
    }
}

public class MultiT2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Process1());
        Thread t2 = new Thread(new Process2());
        t1.start();
        t2.start();
    }
}
