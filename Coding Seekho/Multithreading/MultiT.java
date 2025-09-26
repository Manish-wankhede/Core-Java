class Process1 implements Runnable{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Process p1: "+ i);
        }
    }
}

class Proccess2 implements Runnable{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Process p2: "+ i);
        }
    }
}

public class MultiT {
    public static void main(String[] args) {
        Process1 p1 = new Process1();
        Proccess2 p2 = new Proccess2();

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);

        t1.start();
        t2.start();
    }
}