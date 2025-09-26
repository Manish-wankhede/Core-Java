class MyTask extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class MultiTSleep {
    public static void main(String[] args) {
        MyTask t1 = new MyTask();
        MyTask t2 = new MyTask();
        t1.start();
        t2.start();
    }
}
