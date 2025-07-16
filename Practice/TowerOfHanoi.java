// Tower of Hanoi
public class TowerOfHanoi {
    public static int moves(int n, char t1, char t2, char t3){
        // Termination condition
        if(n == 1){
            return n;
        }

        // movers form t1 to t3
        int step1 = moves(n-1, t1, t2, t3);
        int step2 = 1;
        int step3 = moves(n-1, t3, t2, t1);

        return step1 + step2 + step3;
    }

    public static void main(String[] args) {
        System.out.println(moves(3, 'A', 'B', 'C'));
    }
} 