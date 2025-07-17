public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        King k = new King();
        k.moves();

        Rook r = new Rook();
        r.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Queen - (up, down, left, right, diagonal (in all 4 steps))");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Rook - (up, down, left, right)");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("King - (up, down, left, right, diagonal (in all 1 steps))");
    }
}