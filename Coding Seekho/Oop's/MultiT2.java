class Process3 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Process1: " + i);
        }
    }
}

class Process4 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Process2: " + i);
        }
    }
}

class MultiT2 {
    public static void main(String[] args) {
        Process3 p1 = new Process3();
        Process4 p2 = new Process4();
        p1.start();
        p2.start();
    }
}
